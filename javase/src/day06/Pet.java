package day06;
//宠物类  提取多个宠物共有的特性
public abstract class Pet {
    private int money;//父类的私有属性不能继承
    String name;
    int love;
    int health;
    //没有意义，可以不用写方法实现，只用方法声明
    //称之为抽象方法
//    public void print(){
//        System.out.println("宠物信息如下:"+"姓名："+name+",将康值："+health+",友好度："+love);
//    }
    public abstract void print();
    public abstract void eat();

    public static void main(String[] args) {

    }
}
