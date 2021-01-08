package com.zds.study.jdk;

import java.util.Optional;

/**
 * @author zhudongsheng
 * @Description: TODO
 * @date 2021/1/7 18:27
 */
public class JudgeObjectIsNull {

    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("zds");
        System.out.println(Optional.ofNullable(user));
    }

}

class User{
    private Integer id;
    private String  Name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
