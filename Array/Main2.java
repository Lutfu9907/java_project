package Array;

public class Main2 {
    public static void main(String[] args) {
        int [] array={2,4,6,8,10};
        int toplam=0;
        double ortalama=0;
        
        for(int i=0;i<array.length;i++){
            toplam+=array[i];
        }

        ortalama+=toplam/array.length;
        System.out.println(toplam);
        System.out.print(ortalama+ " ");
    }
}
