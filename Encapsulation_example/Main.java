package Encapsulation_example;

class Oda{
    private int kısa_kenar;
    private int uzun_kenar;
    
    Oda(int kısa_kenar,int uzun_kenar){
        this.kısa_kenar=kısa_kenar;
        this.uzun_kenar=uzun_kenar;
    }

    public void alan_hesapla(){
        int alan=this.kısa_kenar*this.uzun_kenar;
        System.out.println(alan);
    }
}

public class Main {
    public static void main(String[] args) {
        Oda oda1= new Oda(4,8);
        oda1.alan_hesapla();
    }
}
