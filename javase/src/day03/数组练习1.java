package day03;

import java.util.Scanner;

public class 数组练习1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] price=new double[5];
        double all=0;
        System.out.println("请输入本月会员消费记录");
        for (int i=0;i<price.length;i++){
            System.out.println("请输入第"+(i+1)+"笔金额");
            price[i]=sc.nextDouble();
            if(price[i]<0){
                System.out.println("请重新输入");
                //i--;
                //continue;
                price[i]=sc.nextDouble();
            }
            System.out.println("第"+(i+1)+"笔金额:"+price[i]);
        }
        System.out.println("序号         金额(元)");
        for(int j=0;j<price.length;j++){
            System.out.println((j+1)+"         "+price[j]);
            all+=price[j];
        }
        System.out.println("总金额     "+all);
    }
}
