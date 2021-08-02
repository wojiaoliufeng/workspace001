package day06.练习;

import java.util.Scanner;

public class Rent {
    String type;
    int money;
    int day;
}
class Rents{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("你要租几辆车");
        int num = sc.nextInt();
        Rent[] r = new Rent[num];//?
        int days=0;
        int day[]=new int[num];
//        int day = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("1.别克商务  600");
            System.out.println("2.宝马550i  500");
            System.out.println("3.别克林荫  300");
            System.out.println("4.金杯<=16  800");
            System.out.println("5.金龙>16  1500");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    r[i] = new Car("别克商务", 600);
                    System.out.println("你要租用"+r[i].type+"几天？");
                    days=sc.nextInt();
                    day[i]=days;
                    break;
                case 2:
                    r[i] = new Car("宝马550i", 500);
                    System.out.println("你要租用"+r[i].type+"几天？");
                    days=sc.nextInt();
                    day[i]=days;
                    break;
                case 3:
                    r[i] = new Car("别克林荫", 300);
                    System.out.println("你要租用"+r[i].type+"几天？");
                    days=sc.nextInt();
                    day[i]=days;
                    break;
                case 4:
                    r[i] = new Bus("金杯<=16", 800);
                    System.out.println("你要租用"+r[i].type+"几天？");
                    days=sc.nextInt();
                    day[i]=days;
                    break;
                case 5:
                    r[i] = new Bus("金龙>16", 1500);
                    System.out.println("你要租用"+r[i].type+"几天？");
                    days=sc.nextInt();
                    day[i]=days;
                    break;
            }
        }
        int sum = getMoney(r, day);
        System.out.println("总租金：" + sum);
    }



    public static int getMoney(Rent[] r,int[] day){
        int sum=0;
        for(int i=0;i<r.length;i++){
            sum+=r[i].money*day[i];
        }
        return sum;
    }



}


