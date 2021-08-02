package day05.work;
import java.util.Scanner;
public class Employee {
    private String name;
    private String sex;
    private int age;
    private int sal;
    private int sum=0;
    public String getName(){
        return this.name;
    }
    public String getSex(){
        return this.sex;
    }
    public int getAge(){
        return this.age;
    }
    public int getSal(){
        return this.sal;
    }
    public void setName(String name){
        if ("1234567890!@#$%^&*()_+-=/".indexOf(name)!=-1){
            System.out.println("请输入正确的名字");
        }
        this.name=name;
    }
    public void setSex(String sex){
        if(!(sex.equals("男"))&&!(sex.equals("女"))){
            System.out.println("请输入男或女");
        }else {
            this.sex=sex;
        }

    }
    public void setAge(int age){
        if (age<1||age>100){
            System.out.println("请输入0到100之间的整数");
        }else {
            this.age=age;
        }

    }
    public void setSal(int sal){
        if(sal<1||sal>20000){
            System.out.println("工资在1到20000之间");

        }else {
            this.sal=sal;
        }

    }
    public void print(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("性别："+sex);
        System.out.println("薪水："+sal);
    }
    public void addSal(){
        if (sal<=19000){
            sal=sal+1000;
            sum+=1000;
        }
        System.out.println("你的当前工资为："+sal+"元,累计涨薪"+sum+"元");
        this.setSal(sal);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee emp=new Employee();
        System.out.print("请输入你的姓名:");
        String name=sc.next();
        emp.setName(name);
        System.out.print("请输入你的性别：");
        String sex=sc.next();
        emp.setSex(sex);
        System.out.print("请输入你的年龄：");
        int age=sc.nextInt();
        emp.setAge(age);
        System.out.print("请输入你的当前薪水:");
        int sal=sc.nextInt();
        emp.setSal(sal);
        emp.print();
        emp.addSal();
        emp.addSal();
    }
}
