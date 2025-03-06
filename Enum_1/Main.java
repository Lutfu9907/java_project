package Enum_1;

enum Size{
    small,medium,large,extralarge
}

class Kebap {
    Size kebapSize;
    Kebap(Size kebapSize){
        this.kebapSize=kebapSize;
    }

    public void kebapType(){
        switch (kebapSize) {
            case small:
                System.out.println("kucuk bir kebap");
                break;
            case medium:
                System.out.println("orta bir kebap");
                break;
            case large:
                System.out.println("buyuk bir kebap");
                break;
            case extralarge:
                System.out.println("ekstra buyuk bir kebap");
                break;    
        
            default:
                break;
        }
    }
    
}

public class Main {
    public static void main(String[] args) {
        Kebap k1=new Kebap(Size.extralarge);
        k1.kebapType();         
    }
}
