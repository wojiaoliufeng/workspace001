package test;

//import day05.Dog;//默认的不能访问

import day05.student;
import day06.day06;
import java.text.ParseException;
import static day06.day06.getColor;//分别对应 包 类 静态方法
public class test {
    public static void main(String[] args) throws ParseException {
        getColor();//不同包导入静态方法
        day06.getColor();
//       student s=new student();
//       s.init();
//       s.display();
//       s.modify("谁敢动我的小虎牙","刘凝","女","1999-08-15");
//       s.display();

    }
}
