package day04;

import java.util.Arrays;

public class workday04 {
    public static void main(String[] args) {
        hebing();
        sum();
        search();
        search2();
    }

    //数组合并，升序排列
    public static void hebing(){
        int i1[]={1,3,5,7,9};
        int i2[]={0,2,4,6,8,10};
        int i3[]=new int[i1.length+i2.length];
        System.arraycopy(i1,0,i3,0,i1.length);
        System.arraycopy(i2,0,i3,i3.length/2,i2.length);
        Arrays.sort(i3);
        System.out.println(Arrays.toString(i3));
    }


    //二维数组求所有元素和
    public static void sum(){
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                sum+=nums[i][j];
            }
        }
        System.out.println("总和是"+sum);
    }

    //找出数组中第二大的数，求他的下标和元素
    public static void search(){
        int[] arr={1,3,2,4,5,7,6,9};
        int[] arrs=Arrays.copyOfRange(arr,0,arr.length);
        int index=0;
        Arrays.sort(arrs);
        int a=arrs[arrs.length-2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                index=i;
                break;
            }
        }
        System.out.println("原数组为"+Arrays.toString(arr));
        System.out.println("第二大值为"+a+",下标为"+index);
    }
    public static void search2(){
        int[] arr={11,3,2,4,6,7,8,4,10,9};
        int index=1;
        int mindex=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                index=mindex;
                mindex=i;
            }
            else if (arr[mindex]>arr[mindex+1]){
                for(int j=mindex+1;j<arr.length;j++){
                    if (arr[index]<arr[j]){
                        index=j;
                    }
                }
            }
//            else{
//                if(arr[index]<arr[i]){
//                    index=i;
//                }
//            }


        }
        System.out.println("该数组第二大的值为"+arr[index]+",下标为"+index);
    }

}
