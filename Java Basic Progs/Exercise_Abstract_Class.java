interface basicAnimal {
    public void sleep();
    public void eat();
}
class Monkey {
    void jump() {
        System.out.println("Jumping...");
    }
    void bite() {
        System.out.println("Biting...");
    }
}
class Human extends Monkey implements basicAnimal {
    public void sleep() {
        System.out.println("Sleeping...");
    }
    public void eat() {
        System.out.println("Eating...");
    }
}
public class Exercise_Abstract_Class {
    public static void main(String[] args) {
//        Human h = new Human();
//        h.eat();
//        h.sleep();
//        h.bite();
//        h.jump();
        Monkey m = new Human();
        m.bite();
        basicAnimal b = new Human();
        b.eat();
    }
}
