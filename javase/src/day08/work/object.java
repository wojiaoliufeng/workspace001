package day08.work;

import java.util.Random;

public enum  object {
    ONE(1),TWO(2),THREE(3),
    FOUR(4),FIVE(5),SIX(6),
    SIVEN(7),EIGHT(8),NINE(9),
    TEN(10),ELEVEN(11);
    private object(int a){
        System.out.println("最多只有11个,第"+a+"个");
    }

    public static void main(String[] args) {
        object o1=object.ONE;
    }
}


class work2{
    private static work2[] object=new work2[11];
    //初始化11个对象  静态代码块
    static {
        for (int i=0;i<object.length;i++){
            object[i]=new work2();
        }
    }
    private work2(){}
    private static work2 w;
    //初始化11个对象 每使用一次 随机给一个
    public static work2 getInstance(){
        Random r=new Random();
        int index=r.nextInt(11);
        return object[index];

    }

    public static void main(String[] args) {
        for(int i=0;i<11;i++){
            work2 w=work2.getInstance();
            System.out.println(w);
        }
    }
}