package Car_Object;

public class Araba {
    public String marka,model;
    public int hiz;

    public Araba(String marka, String model, int hiz){
        this.marka="renault";
        this.model="megane";
        this.hiz=90;
    }
    public void drive(){
        hiz+=10;
        System.out.println(marka + " " + model + " sürülüyor. Yeni hız: " + hiz);
    }
    public void stop(){
        hiz=0;
        System.out.println(marka + " " + model + " durdu. Hız: " + hiz);
    }
    public String arabaBilgi() {
        return "Marka: " + marka + ", Model: " + model + ", Hız: " + hiz;
    }

    public static void main(String[] args) {
        Araba araba = new Araba("renault", "megane", 90);
        System.out.println(araba.arabaBilgi());

        araba.drive();
        araba.stop();
    }
}
