package day09;
//工厂模式
public class Fruit {

}
class Apple extends Fruit{

}
class Orange extends Fruit{

}
//工厂对象  普通工厂模式
class FactoryBean{
    public Fruit product(String type){
        if (type.equals("apple")){
            //返回一个苹果对象
            return new Apple();
        }else if (type.equals("orange")){
            //返回橘子对象
            return new Orange();
        }else {
            System.out.println("选择有误");
            return null;
        }
    }
}
//多工厂模式:提供了多个方法分别创建对象
class FactoryBean2{
    public Apple getApple(){
        //后期的对象是很复杂的 可能需要传递一些参数
        //一个对象可能需要其他对象才能创建出来
        return new Apple();
    }
    public Orange getOrange(){
        return new Orange();
    }
}

//静态工厂模式:多工厂模式基础上 让每一个方法都是静态的
//这样就可以通过类名直接访问
class FactoryBean3{

    public static Apple getApple(){
        return new Apple();
    }
    public static Orange getOrange(){
        return new Orange();
    }

    public static void main(String[] args) {
        //比较适合复杂对象的创建   因为可以屏蔽创建对象的逻辑
        Apple a=FactoryBean3.getApple();
        Orange o=FactoryBean3.getOrange();
    }
}