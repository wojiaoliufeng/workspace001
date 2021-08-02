package day06;

import java.util.Scanner;

public class Dog extends Pet{

    String type;
    public void eat(){
        health+=10;
        love+=10;
        System.out.println("狗开始吃肉，健康值+10，友好度+10");
    }
    public void print(){
        System.out.println("狗信息如下:"+"姓名："+name+",健康值："+health+",友好度："+love+",品种:"+type);
    }
    public static void main(String[] args) {
//        Dog d=new Dog();
//        d.type="金毛";
//        d.love=100;
//        d.health=100;
//        d.name="泡芙";
//        d.print();
        Scanner sc=new Scanner(System.in);
        System.out.println("欢迎进入宠物商店：");
        System.out.println("请输入领养宠物类型：1.狗，2.企鹅");
        int n= sc.nextInt();
        Pet pet=null;
        if(n==1){
            pet=new Dog();
            System.out.println("请输入狗的名字");
            String name=sc.next();
            pet.name=name;
            System.out.println("请输入狗的品种1.金毛 2.哈士奇 3.柯基 4.萨摩耶");
            int num=sc.nextInt();
            //type是子类独有的资源
            //p强转成子类
            Dog d=(Dog) pet;
            switch (num){
                case 1:d.type="金毛";break;
                case 2:d.type="哈士奇";break;
                case 3:d.type="柯基";break;
                case 4:d.type="萨摩耶";break;
            }

        }else if(n==2){
            pet=new Penguin();
            System.out.println("请输入企鹅名字");
            String name=sc.next();
            pet.name=name;
            System.out.println("请输入企鹅的性别");
            Penguin p=(Penguin)pet;
            p.sex=sc.next();

        }
        pet.print();
        System.out.println("开始喂食");
        Master m=new Master();
        m.feed(pet);
        pet.print();

    }

}
