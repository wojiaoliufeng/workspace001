package day06.game;

import java.util.Scanner;

public class player extends game {
    public player(String name, int hp, int attack, int defend) {
        super(name,hp,attack,defend);
    }
    public player(){}
    public void setAttribute(){
        Scanner sc=new Scanner(System.in);
        System.out.print("设置玩家名字");
        this.name=sc.next();
        System.out.print("设置玩家血量");
        this.hp=sc.nextInt();
        System.out.print("设置玩家攻击");
        this.attack=sc.nextInt();
        System.out.print("设置玩家防御");
        this.defend=sc.nextInt();
    }
}
