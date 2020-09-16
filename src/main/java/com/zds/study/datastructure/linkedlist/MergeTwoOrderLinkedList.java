package com.zds.study.datastructure.linkedlist;


// 合并两个有序链表
public class MergeTwoOrderLinkedList {

    static class Node{
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        // 测试
        // 准备好两个有序链表
        //可能 存在的情况 一个空 两个空 两个都不为空

        Node n14 = new Node(4,null);
        Node n12 = new Node(2,n14);
        Node n11 = new Node(1,n12);
        Node head1 = n11;

//        while(head1 != null){
//            System.out.println(head1.value);
//            head1 = head1.next;
//        }
        Node n24 = new Node(4,null);
        Node n23 = new Node(3,n24);
        Node n21 = new Node(1,n23);
        Node head2 = n21;

        System.out.println("========");
//        while(head2 != null){
//            System.out.println(head2.value);
//            head2 = head2.next;
//        }
//        Node head = mergeTwo(head1, head2);
//        Node head = mergeTwo1(head1, head2);

//        while(head != null){
//            System.out.println(head.value);
//            head = head.next;
//        }



        Node head3 = mergeTwo(head1,null);

        while(head3 != null){
            System.out.println(head3.value);
            head3 = head3.next;
        }

    }

    //定义一个合并两个有序链表的方法
    public static Node mergeTwo(Node head1 ,Node head2){

        //构建一个新的链表头部
        Node head = new Node(0,null);
        Node tail = head; //最开始头尾节点在同一个位置
        //只要两个链表都不为空 开始整合
        while(head1!=null&&head2!=null){

            //先判断哪一个链表当前的值最小 逐个找到第一小次小的值挂到新建的头结点上
            //如果head1 小于head2的值
            if(head1.value<=head2.value){
                //新建的尾指针指向小的节点
                tail.next = head1;
                //小的节点右移
                head1 = head1.next;
                //新节点的尾指针后移
                tail = tail.next;

            }else{
                tail.next = head2;
                head2 = head2.next;
                tail = tail.next;
            }

        }

        //上面两个链表有一个排序完了
        if(head1!=null){
            //新建的节点的尾节点指向这个还剩余右节点的指针
            tail.next = head1;
            //剩余节点右移动
            head1 = head1.next;
            //尾指针右移动
            tail = tail.next;
        }

        if(head2!=null){
            //新建的节点的尾节点指向这个还剩余右节点的指针
            tail.next = head2;
            //剩余节点右移动
            head2 = head2.next;
            //尾指针右移动
            tail = tail.next;
        }
         return head;
    }



    public static Node mergeTwo1(Node head1 ,Node head2){
        //边界条件
        if(head1==null&& head2 == null){
            return null;
        }
        if(head1 == null|| head2 != null){
            return head2;
        }
        if(head1 != null|| head2 == null){
            return head1;
        }

        Node head = new Node(0,null);
        Node tail = head; //最开始头尾节点在同一个位置
        while(head1!=null&&head2!=null){
            if(head1.value<=head2.value){
                //新建的尾指针指向小的节点
                tail.next = head1;
                //小的节点右移
                head1 = head1.next;

            }else{
                tail.next = head2;
                head2 = head2.next;
            }
            //新节点的尾指针后移
            tail = tail.next;

        }
        //上面while走完 两个链表有一个排序完了
        if(head1!=null){
            //新建的节点的尾节点指向这个还剩余右节点的指针
            tail.next = head1;
        }
        if(head2!=null){
            //新建的节点的尾节点指向这个还剩余右节点的指针
            tail.next = head2;
        }
        return head;
    }



}
