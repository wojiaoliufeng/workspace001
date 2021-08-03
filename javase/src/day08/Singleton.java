package day08;
//单例模式1:a.构造私有化  b.对外提供方法  返回一个对象
//单例模式2：饿汉式和懒汉式
public class Singleton {
    private Singleton(){}
    //饿汉式 还没有使用对象就先创建出来了
    //private static Singleton s=new Singleton();
    //懒汉式  什么时候使用什么时候创建
    private static Singleton s;

    public static Singleton getObject(){
        if (s==null){
            s=new Singleton();
        }         //if里面是懒汉式的写法
        return s;
    }


    private enum Intance{
        ONE;        //一个枚举项也只会调用一次构造方法
        private  Singleton s;
        private  Intance(){
            s=new Singleton();
        }
    }
    public static Singleton getObject2(){
        return Intance.ONE.s;
    }

}
class TestSingleton{
    public static void main(String[] args) {
//        Singleton s1=Singleton.getObject();
//        Singleton s2=Singleton.getObject();
//        Singleton s3=Singleton.getObject();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
        System.out.println(Singleton.getObject2());
        System.out.println(Singleton.getObject2());
    }
}
