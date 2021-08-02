package day06.game;

import java.util.Scanner;
//super 类似于this 获取父类属性
//super.属性 super.方法()  调用父类属性
//super()  super(参数) 因为构造不能继承 只能通过它调用 调用父类无参和有参
//也必须写在构造方法中 而且是第一行 和this()不能一起用
//如果编写了super（参数），那么默认提供的就是失效的
public class game {
    public String name;
    public int hp;
    public int attack;
    public int defend;
    public game(String name,int hp,int attack,int defend){
        this.name=name;
        this.attack=attack;
        this.hp=hp;
        this.defend=defend;
    }
    public game(){}

    public void setAttribute(){

    }
    public void setAttack(){
        System.out.println("玩家："+name+"对怪兽发动了攻击");
        System.out.println(name+"的攻击力是"+attack+",生命值是"+hp);

    }
    public void setDefend(game g){
        int num=(int)Math.floor(Math.random()*100);
        System.out.println(num);
        if (num>50){
            attack*=2;
            System.out.println("怪兽发动绝招：来骗来偷袭");
        }
        if (defend<attack){
            int s=attack-defend;
                System.out.println("玩家掉血:"+s+",剩余血量"+(hp-s));
        }else {
            System.out.println("玩家掉血为0");
        }
    }
}
