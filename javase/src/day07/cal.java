package day07;
import java.util.Scanner;
public class cal {
    double a;
    double b;
    public void mul(double a,double b){
        System.out.println(a+"*"+b+"="+(a*b));
    }
    public void div(double a,double b){
        System.out.println(a+"/"+b+"="+(a/b));
    }
    public void add(double a,double b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
    public void sub(double a,double b){
        System.out.println(a+"-"+b+"="+(a-b));
    }
    public void ass(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要要运算的a,b值");
        System.out.println("a的值为：");
        double a=sc.nextDouble();
        this.a=a;
        System.out.println("b的值为：");
        double b=sc.nextDouble();
        this.b=b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        cal c=new cal();
        boolean d=true;

        while (d){
            System.out.println("请选择要进行的运算");
            System.out.println("1.加法  2.减法  3.除法  4.乘法");
            int num=sc.nextInt();
            switch (num){
                case 1:
                {c.ass();c.add(c.a,c.b);
                    System.out.print("是否继续(y/n):");
                    String a=sc.next();
                if (a.equals("y")){
                    d=true ;
                    break;
                }else {
                   d=false;
                   break;
                }}
                case 2:
                {c.ass();c.sub(c.a,c.b);
                    System.out.print("是否继续(y/n):");
                    String a=sc.next();
                    if (a.equals("y")){
                        d=true ;
                        break;
                    }else {
                        d=false;
                        break;
                    }}
                case 3:
                {c.ass();c.div(c.a,c.b);
                    System.out.print("是否继续(y/n):");
                    String a=sc.next();
                    if (a.equals("y")){
                        d=true;
                        break;
                    }else {
                        d=false;
                        break;
                    }}
                case 4:
                {c.ass();c.mul(c.a,c.b);
                    System.out.print("是否继续(y/n):");
                    String a=sc.next();
                    if (a.equals("y")){
                       d=true;
                       break;
                    }else {
                        d=false;
                         break;
                    }}
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }

    }
}
