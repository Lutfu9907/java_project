package File_Control;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        
        try {
            File dosya = new File("text.txt");
            if(dosya.exists()){
                System.out.println("dosya mevcut");
            }else{
                System.out.println("dosya mevcut değil");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
