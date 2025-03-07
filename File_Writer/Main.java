package File_Writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // FileWriter dosyam = new FileWriter("text.txt",true);
            // Dosyaya veri yazdırma işlemi
            // append:true --> var olanı koru, üzerine ekle.
            // dosyam.write("Lutfu");

            BufferedReader dosyam = new BufferedReader(new FileReader("text.txt")); // Dosya okuma işlemi
            String satir;

            while ((satir = dosyam.readLine()) != null) {
                System.out.println(satir);
            }

            dosyam.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
