package day02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class workday02 {
    public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
        DecimalFormat x=new DecimalFormat("###,##0.00");

        //基础1
//        System.out.println("请输入你的消费金额");
//        double money=sc.nextDouble();
//        double discount=Math.floor(Math.random()*90+10);
//        discount=discount/10;
//        System.out.println("恭喜你抽到"+discount+"折");
//        double result=money*(discount/10);
//        String result1=x.format(result);
//        System.out.println("你的消费金额是"+money+"元,折扣后是"+result1+"元");
//
//        //基础2
//        System.out.println("请输入4位数");
//        if(sc.hasNextInt()){
//            int nums=sc.nextInt();
//            int a=nums/1000;
//            int b=nums/100%10;
//            int c=nums/10%10;
//            int d=nums%10;
//            int e=a+b+c+d;
//            if(nums/1000>0&&nums/1000<10){
//                System.out.println(nums+"的四位数之和是"+e);
//            }else {
//                System.out.println("请满足4位数");
//            }
//        }else {
//            System.out.println("请输入数字");
//        }
//
//
//
//
//        //基础3
//        System.out.println("请输入消费额度");
//        double spend=sc.nextDouble();
//        if(spend*0.8>1000){
//            System.out.println("恭喜你获得200元代金券");
//        }
//
//
//        //选做1
//        System.out.println("请输入消费金额");
//        double consume=sc.nextDouble();
//        System.out.println("请输入积分");
//        int score=sc.nextInt();
//        double sum=0;
//        if(score<=2000){
//            sum=consume*0.9;
//        }else if(score>2000&&score<=4000){
//            sum=consume*0.8;
//        }else if(score>4000&&score<=8000){
//            sum=consume*0.75;
//        }else if(score>8000){
//            sum=consume*0.7;
//        }
//        System.out.println("应交金额"+sum);
//
//
//
//        //选做2
//        System.out.println("按编号选择形状  1长方形   2正方形  3三角形  4圆形");
//        int code=sc.nextInt();
//        switch (code){
//            case 1:
//                System.out.println("请输入长");
//                double longs=sc.nextDouble();
//                System.out.println("请输入宽");
//                double width=sc.nextDouble();
//                double area=longs*width;
//                System.out.println("该长方形的面积为："+area);
//                break;
//            case  2:
//                System.out.println("请输入边长");
//                double bian=sc.nextDouble();
//                double zbian=bian*bian;
//                System.out.println("该正方形的面积为:"+zbian);
//                break;
//            case 3:
//                System.out.println("请输入底长");
//                double di=sc.nextDouble();
//                System.out.println("请输入高");
//                double gao=sc.nextDouble();
//                double sbian=di*gao/2;
//                System.out.println("该三角形的面积为:"+sbian);
//                break;
//            case 4:
//                System.out.println("请输入半径");
//                double r=sc.nextDouble();
//                double rr=3.14*r*r;
//                System.out.println("该圆的面积为："+rr);
//                break;
//            default:
//                System.out.println("请输入正确的编号");
//        }
//
//        //循环作业1
        int num=(int)Math.floor(Math.random()*100+1);
        System.out.println(num);
        int count=1;
        System.out.println("请输入数字");
        while(!sc.hasNextInt()){
            String ss=sc.next();
            System.out.println(" 请输入1到100之间的正整数");
        }

            int nums = sc.nextInt();
            while (nums != num) {

                if (nums > num) {
                    System.out.println("大了");
                } else if (nums < num) {
                    System.out.println("小了");
                }
                count++;
                nums = sc.nextInt();
            }

            System.out.println("第" + count + "次,恭喜你猜对了!");



        //循环2
        double yuans=1;
        double j=1;
        int days=1;

        for (int i=1;i<30;i++){
            j=j*1.5;
            yuans=yuans+j;
            if(j<=10){
                days++;
            }
        }
        days=days+1;
        String yuanss=x.format(yuans);
        System.out.println("第"+days+"天时钱超过10块，一个月后钱为"+yuanss+"元");

        //循环3
        int quans=10000/400;
        int seconds=50;
        int m=0;
        for(int i=0;i<quans;i++){
            m+=seconds;
            seconds=seconds+1;
        }
        System.out.println("跑完10000米需要"+m+"秒");

        //循环4
        int day=0;
        double mi=0;
        while (mi<56.7){
            mi=mi+5;
            day++;
            if (mi>56.7){
                break;
            }
            mi=mi-3.5;
        }
        
        System.out.println("需要"+day+"天才能爬出来");
    }
}
