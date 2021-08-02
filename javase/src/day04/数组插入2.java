package day04;

import java.util.Arrays;
import java.util.Scanner;

public class 数组插入2 {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,4,32,1};
        排序算法.quick(a,0,a.length-1);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个你要插入的元素");
        int number= sc.nextInt();
        int newStr[]=new int[a.length+1];
        int index=newStr.length-1;
        for(int i=0;i<a.length;i++){
            newStr[i]=a[i];
        }
        for(int i=0;i<a.length;i++){
            if(number<a[i]){
                index=i;
            }
        }
        for(int i=newStr.length-1;i>index;i--){
            newStr[i]=newStr[i-1];
        }
        newStr[index]=number;
        System.out.println(Arrays.toString(newStr));
    }

}
