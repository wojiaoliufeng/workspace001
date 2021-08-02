package day06;

public class day06 {
    int count;//普通成员变量
    static int lines;//静态变量或者叫类变量
    public static String getColor(){  //静态方法
        return "yellow";
    }
    public static void main(String[] args) {
        day06 d=new day06();
        d.count=10;//普通成员变量，其他对象成员变量与他无关
        day06 d1=new day06();
        System.out.println(d.count);//10
        System.out.println(d1.count);//0
        d.lines=100;//会在全类共享，通过类创建的对象都会共享属性
        System.out.println(d.lines);//100
        System.out.println(d1.lines);//100
        System.out.println(day06.lines);//类名访问
        String color=day06.getColor();//调用静态方法
        getColor();//同一个类中，静态方法是可以相互调用的，不同类只能通过类名调用
    }
}
