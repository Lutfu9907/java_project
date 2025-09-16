package Try_catch_example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        try{
            number = 100 / number;  
        }catch(ArithmeticException e){
            System.out.println("Hata: " + e.getMessage());
        }finally{
            System.out.println("Program sonlandı.");
        }
        scanner.close();
    }
}