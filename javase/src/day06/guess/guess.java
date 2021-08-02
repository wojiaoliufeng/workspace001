package day06.guess;

import java.util.Scanner;

public class guess {
    public static int v;
    public int num;

    static {
        v = 100;
    }
    public void gs(int num) {
        Scanner sc=new Scanner(System.in);
        int count = 1;
        while (num != v) {
            count+=1;
            if (num > v) {
                System.out.println("大了");
            } else if(num < v){
                System.out.println("小了");
            }
            System.out.println("继续猜");
            num=sc.nextInt();
        }
        if (count==1){
            System.out.println("只猜了1次，你是个王者");
        }else if (count==2){
            System.out.println("只猜了2次，你是个星耀");
        }else if(count<=4){
            System.out.println("只猜了"+count+"次，你是个钻石");
        }else if(count<=6){
            System.out.println("只猜了"+count+"次，你是个黄金");
        }else if (count<=10){
            System.out.println("只猜了"+count+"次，你是个白银");
        }else if(count>10){
            System.out.println("居然猜了"+count+"次，你是个青铜");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        guess g=new guess();
        System.out.println("请输入0~100之间的数字");
        g.v = (int) Math.floor(Math.random() * 100 + 1);
        System.out.println(v);
        g.num=sc.nextInt();

        g.gs(g.num);
    }
}
