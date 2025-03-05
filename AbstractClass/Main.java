package AbstractClass;

abstract class Animal {
    abstract void makeSound();

    public void eat(){
        System.out.println("hayvanlar yemek yer");
    }
    
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("kopekler havlar");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("kediler miyavlar");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog alex=new Dog();
        alex.eat();
        alex.makeSound();
        
        Cat kedi=new Cat();
        kedi.eat();
        kedi.makeSound();

    }
}
