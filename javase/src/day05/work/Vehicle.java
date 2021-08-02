package day05.work;
import java.util.Scanner;
public class Vehicle {
    private int speed;
    private int size;
    public int getSpeed(){
        return this.speed;
    }
    public int getSize(){
        return this.size;
    }
    public void setSpeed(int speed){
        this.speed=speed;
        System.out.println("当前速度为"+speed);
    }
    public void setSize(int size){
        this.size=size;
        System.out.println("当前体积为"+size);
    }
    public void init(){
        this.speed=100;
        this.size=10;
        System.out.println("当前速度为："+speed+",体积为："+size);
    }
    public void move(int speed){
        int time=1;
        int mins=60;
        System.out.println("当前速度是每小时移动"+(time*speed)+"公里，平均每分钟移动"+((double)speed/mins)+"公里");
    }
    public void speedUp(int speedUp){
        speed=speed+speedUp;
        System.out.println("当前速度为"+speed);
        this.move(speed);
    }
    public  void speedDown(int speedDown){
        speed=speed-speedDown;
        System.out.println("当前速度为"+speed);
        this.move(speed);
    }

    public static void main(String[] args) {

    }
}
class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vehicle v=new Vehicle();
        v.init();
        System.out.print("请设置速度");
        int speed=sc.nextInt();
        v.setSpeed(speed);
        v.move(speed);
        System.out.print("请输入想降的速度");
        int speedDown=sc.nextInt();
        v.speedDown(speedDown);
        System.out.print("输入想加的速度");
        int speedUp=sc.nextInt();
        v.speedUp(speedUp);
    }
}
