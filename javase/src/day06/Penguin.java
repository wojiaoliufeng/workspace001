package day06;

public class Penguin extends Pet{

    String sex;
    public void eat(){
        health+=10;
        love+=10;
        System.out.println("企鹅开始吃鱼，健康值加10，友好度+10");
    }
    public void print(){
        System.out.println("企鹅信息如下:"+"姓名："+name+",将康值："+health+",友好度："+love+",性别:"+sex);
    }

}
