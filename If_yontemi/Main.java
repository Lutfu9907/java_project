package If_yontemi;

import java.util.Scanner;

public class Main {
    public static void main (String[] args ){
        Scanner input=new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas=input.nextInt();

        if(yas>18){
            System.out.println("ehliyet almaya uygunsun");
        }else{
            System.out.println("ehliyet almaya uygun değilsin");
        }
        input.close();
    }
}
