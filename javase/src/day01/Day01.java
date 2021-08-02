package day01;

public class Day01 {
    public static void main(String[] args){

       //随机生成四位整数,判断每个位数总和是否超过20
        int num= (int) Math.floor(Math.random()*9000+1000);
        int a=num/1000;
        int b=(num-a*1000)/100;
        int c=(num-a*1000-b*100)/10;
        int d=(num-a*1000-b*100-c*10);
        int e=a+b+c+d;
        if(e>20){
            System.out.println("你的卡号是"+num+"总和是"+e+",恭喜你你是幸运用户");
        }else{
            System.out.println("你的卡号是"+num+"总和是"+e+" ");
        }



    }
}
