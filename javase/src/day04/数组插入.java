package day04;

import java.util.Arrays;

public class 数组插入 {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,7,8,9,12};
        int number=6;
        insert(a,number);
    }
    public static int insert(int[] a,int number){
        int nums[]=new int[a.length+1];
        for(int i=0;i<a.length;i++){
            nums[i]=a[i];
        }
        nums[a.length]=number;
        //选择排序
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    nums[j]=nums[j]^nums[i];
                    nums[i]=nums[j]^nums[i];
                    nums[j]=nums[j]^nums[i];
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return 0;
    }
}
