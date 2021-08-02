package day02;

import java.util.Random;
import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {
        //创建Scanner对象 传入系统类输入流
        Scanner sc = new Scanner(System.in);
//        double number=sc.nextInt();
//        System.out.println("获取的整型数据是"+number);
//        String str=sc.next();
//        System.out.println("获取的字符串数据是"+str);
//        System.out.println("请输入年龄");


//        if (sc.hasNextInt()) {
//
//
//            int age = sc.nextInt();
//            if (age >= 18) {
//                System.out.println("杨家有女初长成");
//            } else {
//                System.out.println("力拔山兮气盖世");
//            }
//
//        }else {
//            System.out.println("你的输入有误");
//        }
        double num=Math.floor(Math.random()*10);
        Random r=new Random();
        int r2=r.nextInt(10);//0~9的整数
        System.out.println("幸运数字是"+r2+"请输入你的会员卡号");

        if(sc.hasNextInt()){
            int nums=sc.nextInt();
            int numb=(nums/100%10);
            if(nums/1000<10&&nums/1000>0) {
                if (numb == r2) {
                    System.out.println("恭喜" + nums + "获得啤酒瓶一打");
                } else {
                    System.out.println(nums + "臭弟弟毛都没捞着");
                }
            }else {
                System.out.println("仅限4位会员号");
            }

        }else {
            System.out.println("输入四位整数");
        }

    }
}
