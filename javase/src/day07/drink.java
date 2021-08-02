package day07;
import java.util.Scanner;
public class drink {
    public int coffee;
    public int cola;
    public int water;
    public static int sum=0;
    public void cola(){
        System.out.println("你是可口党还是百事党");
        System.out.println("1.百事(3元)     2.可口(3元)");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        do{
            if (a==1){
                System.out.println("尊贵的百事人，欢迎品尝肥宅快乐水");
            }else if(a==2){
                System.out.println("卑鄙的异教徒，赶紧拿走你的臭可口");
            }else {
                System.out.println("输入错误,请重新输入");
                a=sc.nextInt();
            }
        }while (a!=1&&a!=2);

    }
    public void coffee(){
        System.out.println("请选择一项附加服务：1.加糖(1元)  2.加奶(5元)   3.不加(0元) ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        do{
            if (a==1){
                System.out.println("加糖成功，请你品尝");
                sum=sum+1;
                System.out.println(sum);
            }else if(a==2){
                System.out.println("加奶成功，这是你的牛奶咖啡");
                sum=sum+5;
            }else if(a==3){
                System.out.println("这是你的苦咖啡");
            }else {
                System.out.println("输入错误,请重新输入");
                a=sc.nextInt();
            }

        }while (a!=1&&a!=2&&a!=3);
    }
    public void buy(){
        Scanner sc=new Scanner(System.in);
        boolean b=true;
        while (b){
            System.out.println("请选择你要购买的饮品：1.矿泉水(2元)  2.咖啡(10元)  3.可乐(3元) ");
            int a=sc.nextInt();
            switch (a){
                case 1: {
                    System.out.println("这是你买的农夫山泉矿泉水");
                    water++;
                    sum+=2;
                    System.out.print("你已消费"+sum+"元，是否继续购买(y/n):");
                    String c=sc.next();
                    if (c.equals("y")){
                        b=true ;
                        break;
                    }else {
                        b=false;
                        break;
                    }
                }
                case 2: {
                    drink d=new drink();
                    coffee++;
                    sum+=10;
                    d.coffee();
                    System.out.print("你已消费"+sum+"元，是否继续购买(y/n):");
                    String c=sc.next();
                    if (c.equals("y")){
                        b=true ;
                        break;
                    }else {
                        b=false;
                        break;
                    }
                }
                case 3: {
                    drink d=new drink();
                    cola++;
                    sum+=3;
                    d.cola();
                    System.out.print("你已消费"+sum+"元，是否继续购买(y/n):");
                    String c=sc.next();
                    if (c.equals("y")){
                        b=true ;
                        break;
                    }else {
                        b=false;
                        break;
                    }
                }
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
        System.out.println("你购买了矿泉水"+water+"瓶,咖啡"+coffee+"杯,可乐"+cola+"瓶,总计消费:"+sum+"元");
    }
}
class test extends drink{
    public static void main(String[] args) {
        test t=new test();
        t.buy();
    }
}