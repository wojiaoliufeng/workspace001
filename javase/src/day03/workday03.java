package day03;

import java.text.DecimalFormat;
import java.util.Arrays;

public class workday03 {
    public static void main(String[] args) {
        Integer iy=2;
        
        System.out.println(iy.compareTo(3));

        DecimalFormat df=new DecimalFormat();
        //基础1求奇数和，偶数和，最大值，最小值
        int[] intnums={1,2,3,4,5,6,7,8,9,1};
        int ji=0;
        int ou=0;
        int max=intnums[0];
        int min=intnums[0];
        for (int i=0;i<intnums.length;i++){
            if(intnums[i]%2==0){
                ou+=intnums[i];
            }else {
                ji+=intnums[i];
            }
            if(intnums[i]>max){
                max=intnums[i];
            }else if(intnums[i]<min){
                min=intnums[i];
            }
        }
        System.out.println("该数组奇数和为"+ji+",偶数和为"+ou+",最大值为"+max+"，最小值为"+min);

        //基础2  把最大值和第一位互换
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int[] temp=new int[1];
        int max2=nums[0];
        int x=0;
        for(int i=0;i<nums.length;i++){
            if (max2<nums[i]){
                max2=nums[i];
                x=i;
            }
        }
        temp[0]=nums[x];
        nums[x]=nums[0];
        nums[0]=temp[0];
        System.out.println(Arrays.toString(nums));

        //选做1
        int arr[]={2,3,4,5,2,3,4,2,2,2,2};
        int j=0;
        int i=0;
        int m=0;
        int arrs[]=new int[11];
        arrs[0]=arr[0];
        int arrnums[]=new int[11];
        arrnums[0]=0;
        for( i=0;i<arr.length;i++) {
            for ( j = 0; j <arrs.length; j++) {
                if (arrs[j] == arr[i]) {
                    arrnums[j]++;break;
                }
            }
            if(j==arr.length){
                m++;
                arrs[m]=arr[i];
                arrnums[m]=1;
            }
        }
        System.out.println(Arrays.toString(arrs));
        for(int k=0;k<=m;k++){
            if(arrnums[k]>arr.length/2){
                System.out.println("出现最多的为"+arrs[k]+"次数为"+arrnums[k]);
            }
        }


        //选做2
        int a[]=new int[5];
        int c=0;
        for (int b=0;b<a.length;b++){

            do{
                c=(int)(Math.floor(Math.random()*10+1));

            }while(Arrays.toString(a).indexOf(""+c)!=-1);
            a[b]=c;
        }
        System.out.println(Arrays.toString(a));

    }
}
