package Fonksiyonlar;

public class Main {

    public static int Toplam(int sayi1,int sayi2){
        int toplam;
        toplam= sayi1 + sayi2;
        System.out.println(toplam);

        return toplam;
    }
    public static void main(String[] args) {
       
        int sayi1=5;
        int sayi2=10;
        Toplam(sayi1,sayi2);
        
    }
    
}
