package day08.work;
public abstract class Emp {
    int id;
    String name;
    double salary;
    public abstract void work();
}
 class manger extends Emp{
    int bonus;
    public void work(){
        System.out.println("我的工作是踢足球");
    }
}
class staff{
    public void work(){
        System.out.println("我的工作是看书");
    }
}
class test{
    public static void main(String[] args) {
        manger m=new manger();
        m.work();
        staff s=new staff();
        s.work();
    }

}
