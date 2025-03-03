package Recursive;

public class Main {

    public static int faktoriyel(int a){
        if(a!=0){
            return a* faktoriyel(a-1);
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int sonuc;
        sonuc = faktoriyel(5);
        System.out.println(sonuc);
    }   
}
