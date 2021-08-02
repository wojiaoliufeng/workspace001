package day06.练习;
import java.util.Scanner;
public class Bus extends Rent {
    public Bus(String type,int money){
        //调用父类资源
        super.type=type;
        super.money=money;
        super.day=day;
    }
    public Bus(){}
}
