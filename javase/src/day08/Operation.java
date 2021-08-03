package day08;

import java.util.Scanner;

public interface Operation {
    public int cal(int a,int b);
}
class add implements Operation{
    public int cal(int a,int b){
        return a+b;
    }
}
class sub implements Operation{
    public int cal(int a,int b){
        return a-b;
    }
}
class mul implements Operation{
    public int cal(int a,int b){
        return a*b;
    }
}
class div implements Operation{
    public int cal(int a,int b){
        return (int)(a/b);
    }
}
class test implements Operation{
    public int cal(int a,int b){
        return 0;
    }
    public static void main(String[] args) {
        Operation op=new Operation() {
            @Override
            public int cal(int a, int b) {
                return 0;
            }
        };
        Scanner sc=new Scanner(System.in);
        int a=10;
        int b=20;
        System.out.println("请选择1.加 2.减 3.乘 4.除");
        Operation o=null;
        int n=sc.nextInt();
        switch (n){
            case 1:o=new add();break;
            case 2:o=new sub();break;
            case 3:o=new mul();break;
            case 4:o=new div();break;
        }
        int result=o.cal(a,b);
        System.out.println(result);
    }
}