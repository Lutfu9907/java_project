package do_while_dongusu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı gir");
        int sayi=input.nextInt();

        do{
            toplam+=sayi;
            System.out.println("sayı gir");
            sayi=input.nextInt();
            
        }while(sayi>0);
        System.out.println(toplam);

        input.close();
    }
}
