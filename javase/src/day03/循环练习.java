package day03;

import java.util.Scanner;

public class 循环练习 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入商品编号：");
        System.out.println("1.T恤     2.网球鞋   3.网球拍");
        System.out.println("*****************************");

        int tprice=50;
        int xprice=100;
        int pprice=150;
        int sum=0;
        String sf = "";
        double alls=0;
        do{
            System.out.print("请输入商品编号：");
            int a=sc.nextInt();
            System.out.print("请输入购买数量：");
            int b=sc.nextInt();
            switch (a){
                case 1:sum=b*tprice;System.out.println("t恤￥50   数量:"+b+"   合计"+sum);break;
                case 2:sum=b*xprice;System.out.println("网球鞋￥100   数量:"+b+"   合计"+sum);break;
                case 3:sum=b*pprice;System.out.println("网球拍￥150   数量:"+b+"   合计"+sum);break;
            }
            alls+=sum;
            System.out.println("总价为"+alls);
            System.out.print("是否继续(y/n)：");
            sf=sc.next();
        }while (sf.equals("y"));
        System.out.println("折扣0.8");
        double sumss=alls*0.8;
        System.out.println("应付金额"+sumss);
        System.out.print("实付金额：");
        double sums=sc.nextInt();
        double sumsss=sums-sumss;
        System.out.println("找零"+sumsss);
    }
}
