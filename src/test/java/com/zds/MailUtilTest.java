package com.zds;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;
import com.zds.study.thread.MailUtil;
import com.zds.study.thread.SendMailException;
import jetbrick.template.JetEngine;
import jetbrick.template.JetTemplate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.mail.MessagingException;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static com.zds.study.thread.MailUtil.SMTP_ENT_QQ;
import static com.zds.study.thread.MailUtil.SMTP_QQ;

public class MailUtilTest {

    // 该邮箱修改为你需要测试的邮箱地址
//    private static final String TO_EMAIL = "xiaojiejie@gmail.com";
//    private static final String TO_EMAIL = "zhangyubo@kungeek.com";
    private static final String TO_EMAIL = "2812364443@qq.com";
    private static final String CC = "zhangyubo@kungeek.com";
//    private static final String TO_EMAIL = "zhudongsheng@kungeek.com";

//    @Before
//    public void before() {
//        // 配置，一次即可
//        MailUtil.config(SMTP_QQ(false), "xxx@qq.com", "*******");
//        // 如果是企业邮箱则使用下面配置
//        MailUtil.config(SMTP_ENT_QQ(false), "xxx@qq.com", "*******");
//    }

    @Before
    public void before() {
        // 配置，一次即可
        MailUtil.config(SMTP_QQ(false), "zhudongsheng@kungeek.com", "*********");
        // 如果是企业邮箱则使用下面配置
        MailUtil.config(SMTP_ENT_QQ(false), "zhudongsheng@kungeek.com", "*********");
    }


    @Test
    public void testSendText() throws Exception{
        MailUtil.subject("这是一封测试TEXT邮件")
                .from("小姐姐的邮箱")
                .to(TO_EMAIL)
                .cc(CC)
                .text("信件内容 测试抄送给玉博的是否能正确发出")
                .send();
        Assert.assertTrue(true);
    }

    @Test
    public void testSendHtml() throws SendMailException, MessagingException {
        MailUtil.subject("这是一封测试HTML邮件")
                .from("小姐姐的邮箱")
                .to(TO_EMAIL)
                .html("<h1 font=red>信件内容</h1>")
                .send();
        Assert.assertTrue(true);
    }

    @Test
    public void testSendAttach() throws SendMailException, MessagingException {
        MailUtil.subject("这是一封测试附件邮件")
                .from("小姐姐的邮箱")
                .to(TO_EMAIL)
                .html("<h1 font=red>信件内容</h1>")
//                .attach(new File("/Users/biezhi/Downloads/hello.jpeg"), "龙猫.png")
                .attach(new File("D:/image/龙猫.png"), "龙猫.png")
                .send();
        Assert.assertTrue(true);
    }

    @Test
    public void testSendAttachURL() throws SendMailException, MalformedURLException, MessagingException {
        MailUtil.subject("这是一封测试网络资源作为附件的邮件")
                .from("小姐姐的邮箱")
                .to(TO_EMAIL)
                .html("<h1 font=red>信件内容</h1>")
                .attachURL(new URL("https://avatars1.githubusercontent.com/u/2784452?s=40&v=4"), "测试图片.jpeg")
                .send();
        Assert.assertTrue(true);
    }

    @Test
    public void testPebble() throws IOException, PebbleException, SendMailException, MessagingException {
        PebbleEngine engine = new PebbleEngine.Builder().build();
        PebbleTemplate compiledTemplate = engine.getTemplate("register.html");

        Map<String, Object> context = new HashMap<String, Object>();
        context.put("username", "biezhi");
        context.put("email", "admin@biezhi.me");

        Writer writer = new StringWriter();
        compiledTemplate.evaluate(writer, context);

        String output = writer.toString();
        System.out.println(output);

        MailUtil.subject("这是一封测试Pebble模板邮件")
                .from("小姐姐的邮箱")
                .to(TO_EMAIL)
                .html(output)
                .send();
        Assert.assertTrue(true);
    }

    @Test
    public void testJetx() throws SendMailException, MessagingException {
        JetEngine engine = JetEngine.create();
        JetTemplate template = engine.getTemplate("/register.jetx");

        Map<String, Object> context = new HashMap<String, Object>();
        context.put("username", "biezhi");
        context.put("email", "admin@biezhi.me");
        context.put("url", "<a href='http://biezhi.me'>https://biezhi.me/active/asdkjajdasjdkaweoi</a>");

        StringWriter writer = new StringWriter();
        template.render(context, writer);
        String output = writer.toString();
        System.out.println(output);

        MailUtil.subject("这是一封测试Jetx模板邮件")
                .from("小姐姐的邮箱")
//                .to(TO_EMAIL)
                .to(CC)
                .html(output)
                .send();
        Assert.assertTrue(true);
    }


    @Test
    public void testJetBlood() throws SendMailException, MessagingException {
        JetEngine engine = JetEngine.create();
        JetTemplate template = engine.getTemplate("/blood.jetx");

        Map<String, Object> context = new HashMap<String, Object>();
//        context.put("username", "biezhi");
//        context.put("email", "admin@biezhi.me");
//        context.put("url", "<a href='http://biezhi.me'>https://biezhi.me/active/asdkjajdasjdkaweoi</a>");

        StringWriter writer = new StringWriter();
        template.render(context, writer);
        String output = writer.toString();
        System.out.println(output);

        MailUtil.subject("xx字段预警，将会影响xx系统xx指标")
                .from("data-web开发人员的邮箱")
                .to(TO_EMAIL)
//                .to(CC)
                .html(output)
                .send();
        Assert.assertTrue(true);
    }


    @Test
    public void testHtml() throws IOException, PebbleException, SendMailException, MessagingException {
        PebbleEngine engine = new PebbleEngine.Builder().build();
        PebbleTemplate compiledTemplate = engine.getTemplate("blood.html");
        Map<String, Object> context = new HashMap<String, Object>();
//        context.put("username", "biezhi");
//        context.put("email", "admin@biezhi.me");
        Writer writer = new StringWriter();
        compiledTemplate.evaluate(writer, context);
        String output = writer.toString();
        System.out.println(output);
        MailUtil.subject("<html></html>xx字段预警，将会影响xx系统xx指标")
                .from("data-web开发人员的邮箱html")
                .to(TO_EMAIL)
                .html(output)
                .send();
        Assert.assertTrue(true);
    }
}