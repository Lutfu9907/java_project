package Interface_abstract;

interface Flyable {
    void fly();
}

interface Swimable {
    void swim();
}

class Duck implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("Flying in the sky");
    }

    @Override
    public void swim() {
        System.out.println("Swimming in the water");
    }
}

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.fly();
        duck.swim();
    }
}
