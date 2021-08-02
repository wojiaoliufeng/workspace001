package day04;

import java.util.Arrays;

public class 排序算法 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,6,7,1,2,3};
        quick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
        //插入排序
//        for(int i=0;i<a.length-1;i++){
//            for(int j=i+1;j>0;j--){
//                if(a[j]<a[j-1]){
//                    a[j]=a[j]^a[j-1];
//                    a[j-1]=a[j]^a[j-1];
//                    a[j]=a[j]^a[j-1];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));

        int number=2;
        System.out.println(Arrays.binarySearch(a,1));
        if(search(a,number)!=-1){
            System.out.println("元素存在,下标是"+search(a,number));
        }else {
            System.out.println("元素不存在");
        }

        //选择排序
//        for (int i=0;i<a.length;i++){
//            for (int j=i+1;j<a.length;j++){
//                if (a[j]<a[i]){
//                    a[j]=a[j]^a[i];
//                    a[j+1]=a[j]^a[i];
//                    a[j]=a[j]^a[i];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));

        //排序冒泡
//        for(int i=0;i<a.length;i++){
//            for (int j=0;j<a.length-1-i;j++){
//                if(a[j]>a[j+1]){
//                    a[j]=a[j]^a[j+1];
//                    a[j+1]=a[j]^a[j+1];
//                    a[j]=a[j]^a[j+1];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));
    }
    public static int search(int[] a,int number){
        int min=0;
        int max=a.length-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(a[mid]>number){
                max=mid-1;
            }else if(a[mid]<number){
                min=mid+1;
            }else {
                return mid;
            }
        }
        //如果循环结束表示没有查到数据 通过-1判断没有查到元素；
        return -1;
    }



    //快速排序
    public static void quick(int[] a,int begin,int end){
        if(begin<end){
            //寻找基准数的下标
            int index=getIndex(a,begin,end);
            //使用递归继续排序前半部分
            quick(a,begin,index-1);
            //使用递归继续排序前半部分
            quick(a,index+1,end);
        }
    }
    public static int getIndex(int a[],int begin,int end){
        //定义一个基准数，假设数组的第一个元素
        int temp=a[begin];
        while(begin<end){           //比较多少轮
            while(begin<end&&a[end]>=temp){       //从后往前查,当查找元素大于基准数，end-1,继续扫描上一个数
                end--;
            }
            //查找元素小于基准数 把end的值赋给begin的位置
            a[begin]=a[end];
            while (begin<end&&a[begin]<=temp){      //从前往后查,当查找元素小于基准数，begin+1,继续扫描下一个数
                begin++;
            }
            //查找元素大于基准数 把begin的值赋给end的位置
            a[end]=a[begin];
        }
        //出了循环，表示begin和end相等，该位置就是基准数的位置
        a[begin]=temp;
        return begin;
    }
}
