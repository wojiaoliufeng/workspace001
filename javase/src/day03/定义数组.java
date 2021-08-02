package day03;

public class 定义数组 {
    public static void main(String[] args) {
        //定义数组
        int [] a;
        int b[];
        int[] nums=new int[3];//分配长度3连续空间
        nums[0]=1;
        //ArrayIndexOutOfBoundException 数组越界异常
        //nums[4]=10;//需要运行程序才会出现错误
        String[] strs=new String[]{"a"};
        double[] number={2,3,4,5,6};

        //数组遍历
        for(String i:strs){
            System.out.println(i);
        }
    }
}
