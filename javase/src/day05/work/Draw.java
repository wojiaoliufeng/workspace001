package day05.work;

import java.util.Scanner;

public class Draw {
    public int count;
    public int lines;
    //无参构造必须需要加，后期有些框架帮忙创造对象
    //如果没有，就会创建对象
    //有参构造按需求添加
    public Draw(){

    }
    public void drawRec(int lines,int count){

        for (int i=0;i<lines;i++){
            System.out.println("");
            for(int j=0;j<count;j++){
                System.out.print("*");
            }
        }
        int counts=lines*count;
        System.out.println("该矩形的*个数是"+counts);
        System.out.println("");

    }
    public void drawTrian(int lines){

        for (int i=0;i<lines;i++){
            System.out.println("");
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
        }
        System.out.println("");
        int counts=(lines*lines-lines)/2+lines;
        System.out.println("该直角三角形的*个数是"+counts);
    }
    public void drawPra(int lines,int count){

        for (int i=0;i<lines;i++){
            for (int z=0;z<lines-i;z++){
                System.out.print(" ");
            }
            for(int j=0;j<count;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        int counts=lines*count;
        System.out.println("该平行四边形的*个数是"+counts);
    }

    public static void main(String[] args) {

    }
}
class text1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Draw d=new Draw();
        System.out.println("请输入你想要的行数");
        int lines=sc.nextInt();
        System.out.println("请输入你想要的每行*个数");
        int count=sc.nextInt();
        d.drawPra(lines,count);
        d.drawRec(lines,count);
        d.drawTrian(lines);
    }
}
