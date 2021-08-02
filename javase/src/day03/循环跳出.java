package day03;
//a.System.exit(0)正常退出 System(1)异常退出  都表示程序结束，后面代码无法运行;
//b.return;表示方法结束，如果还有其他方法还会执行
//c.可以给循环添加标记，想跳出哪重循环都可以，不会结束方法和程序
public class 循环跳出 {
    public static void main(String[] args) {
//        for (int x=0;x<5;x++){
//            for (int y=0;y<5;y++){
//                for(int z=0;z<5;z++){
//                    System.out.println(x+" "+y+" "+z);
//                    if(z==1) System.exit(0);
//                }
//            }
//        }
        test();
        test1();
//        System.out.println("循环结束");
    }
    public static  void test(){
        for (int x=0;x<5;x++){
            for (int y=0;y<5;y++){
                for(int z=0;z<5;z++){
                    System.out.println(x+" "+y+" "+z);
                    if(z==1) return;
                }
            }
        }
        System.out.println("循环结束");
    }
    public static  void test1(){
        aaa:
        for (int x=0;x<5;x++){
            for (int y=0;y<5;y++){
                for(int z=0;z<5;z++){
                    System.out.println(x+" "+y+" "+z);
                    if(z==1) break aaa;
                }
            }
        }
        System.out.println("跳出循环外");
    }
}
