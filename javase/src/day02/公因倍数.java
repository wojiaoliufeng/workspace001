package day02;

import java.util.Scanner;

public class 公因倍数 {


        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("输入第一个数：");
            int a=sc.nextInt();
            System.out.println("输入第二个数:");
            int b=sc.nextInt();
            System.out.println("最大公因数为:"+big(a,b));
            System.out.println("最小公倍数为:"+small(a,b));
            sc.close();



        }
        public static int big(int a,int b){
            int c=a>b?b:a;
            int d=1;
            for(int j=2;j<=c;j++){
                if(a%j==0&&b%j==0){
                    d=j;
                }
            }
            return d;
        }
        public static int small(int a,int b){
            int c=big(a,b);  //
            int d=a*b/c;    //除数不能为0，注意调用的上个函数的返回值不能是0
            return d;
        }

}
