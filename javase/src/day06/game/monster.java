package day06.game;

import java.util.Scanner;

public class monster extends game{
    public monster(String name,int hp,int attack,int defend){
       super(name,hp,attack,defend);
    }
    public monster(){}
    public void setAttribute(){
        Scanner sc=new Scanner(System.in);
        System.out.print("设置怪兽名字");
        this.name=sc.next();
        System.out.print("设置怪兽血量");
        this.hp=sc.nextInt();
        System.out.print("设置怪兽攻击");
        this.attack=sc.nextInt();
        System.out.print("设置怪兽防御");
        this.defend=sc.nextInt();
    }
    public void setAttack(){
        System.out.println("怪兽："+name+"对玩家发动了攻击");
        System.out.println(name+"的攻击力是"+attack+",生命值是"+hp);

    }
    public void setDefend(game g){
        int num=(int)Math.floor(Math.random()*100);
        System.out.println(num);
        if (num>50){
            attack*=2;
            System.out.println("玩家"+g.name+"发动必杀技：闪电五连鞭");
        }
        if (defend<attack){
            int s=attack-defend;
            System.out.println("怪兽"+name+"掉血:"+s+",剩余血量"+(hp-s));
        }else {
            System.out.println("怪兽掉血为0");
        }
    }
}
class test{
    public static void main(String[] args) {
       game g1=new player();
       game g2=new monster();
       g1.setAttribute();
       g2.setAttribute();
       g1.setAttack();
       g2.setDefend(g1);
    }
}