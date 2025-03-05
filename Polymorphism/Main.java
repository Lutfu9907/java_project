package Polymorphism;

class Language{
    void displayinfo(){
        System.out.println("Genel dil özellikleri");
    }
}
class Python extends Language{
    void displayinfo(){
        System.out.println("Python dil özellikleri");
    }
}

public class Main {
    public static void main(String[] args) {
        Python p1 = new Python();
        Language l1 = new Language();

        p1.displayinfo();
        l1.displayinfo();
    }
}
