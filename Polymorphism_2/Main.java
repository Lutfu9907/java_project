package Polymorphism_2;

class Animal{
    protected String name;
    public void makeSound(){
        System.out.println("hayvan sesleri");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println( name + ": Hav Hav");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println(name + ": Miyav Miyav");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();

        a.name="alex";
        a.makeSound();

        b.name="minnos";
        b.makeSound();
    }
}
