package day08.work;
public interface LOL {

}
interface physics{
    public void physics();
}
interface magic{
    public void magic();
}
class hero1 implements physics{
    public void physics(){
        System.out.println("我方使用了物理攻击");
    }
}
class hero2 implements magic{
    public void magic(){
        System.out.println("我方使用了魔法攻击");
    }
}
class hero3 implements magic,physics{
    public void magic(){
        System.out.println("我方使用了魔法攻击");
    }
    public void physics(){
        System.out.println("我方使用了物理攻击");
    }
}
class test2{
    public static void main(String[] args) {
        hero1 h1=new hero1();
        h1.physics();
        hero2 h2=new hero2();
        h2.magic();
        hero3 h3=new hero3();
        h3.magic();
        h3.physics();
    }

}