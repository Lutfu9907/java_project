package Interface_metod;

interface Alan {
    void alan_hesapla(int kisa_kenar,int uzun_kenar);
    
}

class Ev implements Alan{
    public void alan_hesapla(int kisa_kenar,int uzun_kenar){
        System.out.println("odamızın alanı:"+(uzun_kenar*kisa_kenar));
    }
}

public class Main {
    public static void main(String[] args) {
        Ev oda1=new Ev();
        oda1.alan_hesapla(3,5 );
    }
}
