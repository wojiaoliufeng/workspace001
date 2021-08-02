package day03;

public class 求出现次数超一半 {
    public static void main(String[] args) {
        int[] nums={2,3,4,5,7,7,7,77,7,7,7};


        exit:
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]) count++;
                if(count>=nums.length/2){
                    System.out.println(nums[i]+"超过一半");
                    break exit;
                }
            }
        }
    }
}
