package day05.work;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Circle {
    private int r;
    public int getR(){
        return this.r;
    }
    public void setR(int r){
        this.r=r;
    }
    public void getArea(){
        double area=3.14*this.r*this.r;
        System.out.println("半径为"+r+"的面积为"+area);
    }
    public void getPerimeter(){
        DecimalFormat df=new DecimalFormat("0.00");
        double c=3.14*2*this.r;
        System.out.println("半径为"+r+"的周长为"+df.format(c));
    }

    public static void main(String[] args) {

    }
}
class test2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle circle=new Circle();
        System.out.print("请输入半径");
        int r=sc.nextInt();
        circle.setR(r);
        circle.getArea();
        circle.getPerimeter();

    }
}