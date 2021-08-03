package day08;

public enum MyEnum {
    ONE("张丹",18),TWO("李思",20);
    private MyEnum(String name,int age){
        System.out.println("调用了有参构造name:"+name+",age:"+age);
    }

    public static void main(String[] args) {
        MyEnum my1=MyEnum.ONE;
        MyEnum my2=MyEnum.ONE;
        MyEnum my3=MyEnum.TWO;
        MyEnum my4=MyEnum.TWO;
    }
}
