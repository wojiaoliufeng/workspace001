package day05.work;

public class Person {
    private String name;
    private int age;
    public Person(){
        this.name="刘枫";
        this.age=20;
    }
    public void display(){
        System.out.println("我的名字是"+name+",我的年龄是"+age);
    }

    public static void main(String[] args) {
        Person man=new Person();
        man.display();
    }
}
