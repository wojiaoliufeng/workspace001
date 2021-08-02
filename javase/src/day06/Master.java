package day06;

public class Master {
    public void feed(Pet pet){
        pet.eat();
    }
    public void feed(Dog d){
        d.eat();
    }
    public void feed(Penguin p){
        p.eat();
    }

    public static void main(String[] args) {
        Pet pet=new Dog();
        //Dog d=(Dog)pet;
        //指向dog无法强转成Penguin
        //ClassCastException 类型强转异常
        //可以通过instanceof先判断他指向谁
        //Penguin p=(Penguin)pet;

        if (pet instanceof Dog){
            Dog d=(Dog)pet;
            System.out.println("转换狗对象成功");
        }
        if (pet instanceof Penguin){
            Penguin p=(Penguin)pet;
            System.out.println("转换企鹅对象成功");
        }
    }
}
