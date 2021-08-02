package day03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class 数组排序方法 {
    public static void main(String[] args) {
        Integer [] nums={1,3,4,5,6,2,2};
        //打印对象类型默认都是引用地址(分配好长度5连续空间地址);
        //System.out.println(nums);
        //Arrays.toString(数组),打印字符串内容
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("排序后"+Arrays.toString(nums));
        //实现倒叙排列  比较器对象实现比较规则(指定类型)
        Comparator com=new Comparator<Integer>() {
            @Override
            //比较器对象 比较的方法
            //规则只是根据两个参数谁大谁小决定；
            //根据返回值整数还是负数来决定正序还是倒叙
            //a-b正序 b-a倒叙
            public int compare(Integer a,Integer b) {
                return b-a;
            }
        };

        Arrays.sort(nums,com);


        //lambda表达式 可以简化函数式接口
        Arrays.sort(nums,(a,b)->b-a);
        System.out.println("排序后"+Arrays.toString(nums));
    }
}
