package day08;
//interface 表示定义为接口
public interface MyInterface {
    //常量
    public static final String SEX="男";
    //常量 默认修饰public static final
    String name="张三";
    //全是抽象方法
    public abstract void test();
    //默认修饰符也是public abstract
    void hello();
}
interface face1{
    public void test();//抽象方法
    public void money();
}
interface face2{
    public void color();
}
//类实现接口
class TestFace implements face1,face2{
    public void test(){

    }
    public void money(){

    }
    public void color(){

    }
}

//接口和接口之间可以多继承
interface face3 extends face4,face5{
    public void test3();
}
interface face4{
    public void test4();
}
interface face5{
    public void test5();
}
//接口只是用于功能声明 不是实现
//谁用它的功能 谁就需要实现他的方法
//接口定义 针对数据库操做的方法
//在不同类定义不同数据库实现规则
//class1实现了MYSQL实现规则
//实现了oracle规则
//TestFace2相当于子类 face3相当于父类
class TestFace2 implements face3{
    @Override
    public void test3() {}
    @Override
    public void test4() {}
    @Override
    public void test5() {}
}

