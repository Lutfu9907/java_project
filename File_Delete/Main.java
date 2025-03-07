package File_Delete;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File dosya = new File("text.txt");
            if(dosya.exists()){
                System.out.println("dosya silindi");
            }else{
                System.out.println("dosya silinemedi");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   
}
