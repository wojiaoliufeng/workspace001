package day05;

import java.util.Scanner;

public class Tree {
        private int age;
        private String type;
        public String getType(){
            return this.type;
        }
        public void setType(String type){
            //用户只能通过对外提供的方法赋值
            switch (type){
                case"1":this.type="松树";break;
                case"2":this.type="杨树";break;
                case"3":this.type="柳树";break;
                case"4":this.type="橡树";break;
            }
        }
        public int getAge(){
            return this.age;
        }
        public void setAge(int age){
            //针对参数age做判断 合法的才能赋值,不合法都是默认值
            if(age>1&&age<1000){
                this.age=age;
            }else {
                System.out.println("输入有误");
                this.age=1;
            }
        }

    //构造方法 方法名（类名一致） 返回值不能写
        public Tree(){
            this(10);//调用一个参数构造
            System.out.println("调用了无参构造");
        }
        //如果定义多个，参数形式要不一样
        public Tree(int age){
            System.out.println("调用有参构造");
        }
        public Tree(int age,String type){
            this();//先调用无参构造
            System.out.println("调用两参构造");
            this.age=age;
            this.type=type;
        }
        public  void Tree(){
            System.out.println("hello");
            System.out.println("this tree is "+type+",his age is "+age);
        }

    public static void main(String[] args) {
            //new对象的过程 就是会调用类中的构造方法
            //如果没有构造方法 无法new对象
        //Tree t=new Tree();
//        Tree a=new Tree(18);


    }
}
class Test{
    public static void main(String[] args) {
        Tree t=new Tree();
        t.setAge(1000);
        System.out.println("请输入");
        Scanner sc=new Scanner(System.in);
        String type=sc.next();
        t.setType(type);
        t.Tree();
    }
}
