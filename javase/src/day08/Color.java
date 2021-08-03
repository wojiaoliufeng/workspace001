package day08;
//枚举可以统一定义常量
public enum Color {
    //有三个枚举项  也只会创建三个对象 因为每个枚举项只会调用一次构造
    RED,GREEN,YELLOW;
    private Color(){
        System.out.println("调用了无参构造");
    }
    String name;
    public void test(String name){
        System.out.println("测试方法"+name);
    }
    public static void testStatic(){
        System.out.println("静态方法");
    }
}
class TestEnum{
    public static void main(String[] args) {
        Color C1=Color.RED;
        Color C2=Color.RED;
        Color C3=Color.GREEN;
        Color C4=Color.GREEN;
        Color C5=Color.YELLOW;
        Color C6=Color.YELLOW;
        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
        System.out.println(C4);
        System.out.println(C5);
        System.out.println(C6);
    }
}
