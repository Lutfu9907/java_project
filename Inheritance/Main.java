package Inheritance;

class Animal {
    
protected String name ; // protected kullanırsan subClass'dan erişim sağlayabilirsin.

    public void eat() {
        System.out.println("Hayvanlar yemek yer");
    }
}

class Dog extends Animal { // buradaki Dog=subClass, Animal=parentClass 
    
    @Override// Üstünlük bu fonksiyonda, override fonksiyona öncelik sağlar.
    public void eat(){
        super.eat(); // Parent class'ındaki eat fonksiyonu çalışır. Yani super keyword ü sayesinde direkt olarak parent class'a ulaştık.
        System.out.println("kopek yemegi yer");
    }

    public void displayName() {
        System.out.println("Kopegin adı:" + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Dog alex = new Dog();

        alex.name="Alex";
        alex.displayName();
 

    }
}
