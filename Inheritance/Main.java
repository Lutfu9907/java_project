package Inheritance;

class Animal {
    
    protected String name = "Alex";

    public void eat() {
        System.out.println("Hayvanlar yemek yer");
    }
}

class Dog extends Animal {
    
    @Override// Üstünlük bu fonksiyonda
    public void eat(){
        super.eat(); // Parent class'ındaki eat fonksiyonu çalışır. Yani super keyword ü sayesinde direkt olarak parent class'a ulaştık.
        System.out.println("kopek yemegi yer");
    }
    public void friendly() {
        System.out.println("Kopekler insan dostudur.");
    }

    public void displayName() {
        System.out.println("Kopegin adı:" + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Dog alex = new Dog();

        alex.eat();
 

    }
}
