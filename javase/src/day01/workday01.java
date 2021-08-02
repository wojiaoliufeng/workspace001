package day01;

import java.text.DecimalFormat;
import java.util.Scanner;


public class workday01 {
    public static void main(String[] args){
        //第一题
        double result=(9.5*4.5-2.5*3)/(45.5-3.5);
        System.out.println(result);
        //第二题
        int a=7;
        int b=(int)((a*10+5)/2+3.14159);
        System.out.println("加密结果为"+b);
        
        
        

        //选做第一题
        double y=14/1.6;
        int s=4*60+30;
        double h=(double)s/3600;
        double x=y/h;
        System.out.println("那个牛人平均每小时跑"+x+"英里");
        //数字格式化对象  保留小数位或者转换为千进制
        DecimalFormat x1=new DecimalFormat("###,##0.00");
        String x2=x1.format(x);
        System.out.println(x2);


        //选做第二题
        long nownums=312032486;
        long seconds=5*365*24*60*60;
        long people=(seconds/7-seconds/13+seconds/45);
        long furnums=nownums+people;
        System.out.println("预测五年后人后为"+furnums);
    }
}
