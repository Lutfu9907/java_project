package While_dongusu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi=input.nextInt();
        
        int toplam=0;
        while(sayi>0){
            toplam+=sayi;
            System.out.println("Sayı giriniz");
            sayi=input.nextInt();  
        }
        System.out.println("toplam degerim "+toplam);
        input.close();
    }
}
