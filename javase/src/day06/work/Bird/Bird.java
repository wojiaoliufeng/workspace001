package day06.work.Bird;

public class Bird {
    public String wings;
    public String feet;
    public Bird(int a){

    }
    public Bird(){}
    public static void main(String[] args) {
        short s=1;
        s+=1;
        System.out.println(s);
        Bird b=new eagle(1);
        System.out.println(((eagle)b).fly);

    }
}
