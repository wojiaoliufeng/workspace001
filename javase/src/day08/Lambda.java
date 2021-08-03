package day08;

public class Lambda {
    public static void main(String[] args) {
//       Compute com=new Compute() {
////           String name;
////           final String sex="男";
//           public void compute() {
//               System.out.println("实现计算部分");
//           }
//       };
//       com.compute();
       //利用lambda  (参数)-> 方法实现部分
        //没有参数和返回值的情况
//        Compute com2=()-> System.out.println("实现lambda计算功能");
//        com2.compute();
        Compute com3=(int a,int b)->{
            return a+b;
        };
        Compute com4=(int a,int b)->a+b;
        //lambda 参数不符可以不写类型
        Compute com5=(a,b)->a+b;
        //lambda 如果参数只有一个，()也可以省略
        MyTest my=a->a*2-2;
    }
}
interface Compute{
    public int compute(int a,int b);
}
interface MyTest{
    public int getNum(int num);
}