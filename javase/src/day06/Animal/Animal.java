package day06.Animal;

public class Animal {
    public void eat(){
        System.out.println("吃");
    }
    public void sleep(){
        System.out.println("睡");
    }
    public void move(){
        System.out.println("走");
    }
}
class Rabbit extends Animal{
    public void eat(){
        System.out.println("吃草");
    }
    public void move(){
        System.out.println("蹦蹦跳跳");
    }
    public static void main(String[] args) {
        Rabbit r=new Rabbit();
        r.sleep();
        r.eat();
        r.move();
    }
}
class Trigger extends Animal{
    public void eat(){
        System.out.println("吃肉");
    }
    public void move(){
        System.out.println("虎虎生风");
    }
    public static void main(String[] args) {
        Trigger t=new Trigger();
        t.sleep();
        t.eat();
        t.move();
    }
}
class eagle extends Animal{
    public void eat(){
        System.out.println("吃肉");
    }
    public void move(){
        System.out.println("小鸟飞飞飞");
    }
    public static void main(String[] args) {
        eagle e=new eagle();
        e.sleep();
        e.eat();
        e.move();
    }
}