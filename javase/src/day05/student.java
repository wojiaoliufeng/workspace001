package day05;

import org.w3c.dom.CDATASection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class student {
    String id;
    String name;
    String sex;
    Date birthday;
    public void init() throws ParseException {
        this.id="我是一颗小虎牙";
        this.name="刘枫";
        this.sex="男";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        this.birthday=sdf.parse("1999-07-15");

    }
    public void modify(String id,String name,String sex,String birthday) throws ParseException {
        this.name=name;
        this.sex=sex;
        this.id=id;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        this.birthday=sdf.parse(birthday);
    }
    public void  display(){
        System.out.println("id:"+this.id);
        System.out.println("name:"+this.name);
        System.out.println("sex:"+this.sex);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("birthday:"+sdf.format(this.birthday));
    }
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d=new Date();
        String time=sdf.format(d);
        System.out.println(time);
        Date date=sdf.parse("1999-07-15");
        System.out.println(date);
    }
}
