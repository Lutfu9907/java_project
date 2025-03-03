package Deger_Alma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir karakter gir");
        char karakter=input.next().charAt(3);
        System.out.println("karakter:"+karakter);

        input.close();
    }
}
