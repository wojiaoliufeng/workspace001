package day06;
//代码块一般分3类：普通代码块，构造代码块，静态代码块
public class Block {
    {
        System.out.println("父类构造代码块,new几次调用几次");
    }
    static{
        System.out.println("父类静态代码块,当类加载的时候运行，只运行一次，在第一行执行");
    }
    public Block(){
        {
            System.out.println("父类构造方法");//方法调用
        }
    }

    public static void main(String[] args) {

    }
}
class  Block2 extends Block {
    {
        System.out.println("子类构造代码块,new几次调用几次");
    }

    static {
        System.out.println("子类静态代码块,当类加载的时候运行，只运行一次，在第一行执行");
    }

    public Block2() {
        {
            System.out.println("子类构造方法");//方法调用
        }
    }

    public static void main(String[] args) {
        Block2 b=new Block2();
    }
}