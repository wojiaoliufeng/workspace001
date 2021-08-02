package day03;

import java.util.Arrays;
import java.util.Scanner;

public class day03 {
    //main方法快捷键  psvm+tab
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //如果获取数据包括空格 可以使用nextLine()获取下一行
//        String name=sc.nextLine();
//        //打印快捷键 sout+tab
//        System.out.println(name=="男");//false  判断指向对象是否一致
//        System.out.println(name.equals("男"));

        int a[] = new int[] { 62, 68, 82, 65, 9 ,62,62,1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62出现的位置:"+Arrays.binarySearch(a, 62));


        //switch的枚举用法
        TestEunm te=TestEunm.A;
        switch (te){
            case A:
                System.out.println("a");
                break;
            case B:
                System.out.println("b");
                break;
            case C:
                System.out.println("c");
                break;
            case D:
                System.out.println("d");
                break;
        }
    }


}
