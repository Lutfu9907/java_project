package Array_2d;

public class Main {
    public static void main(String[] args) {
        int [][] a={{1,2,3},{4,5,6}};
        int [][] b={{1,2,3},{4,5,6}};

        int[][] toplam=new int[2][3];

        for(int i = 0; i < 2; i++){
            for (int j = 0; j <3; j++) {
                toplam[i][j]=a[i][j]+b[i][j];
            }
        }

        System.out.println("toplam matrisim:");
        for (int[] satir : toplam) {
            for (int kolon : satir) {
                System.out.print(kolon+" ");
            }
            System.out.println();
        }
    }
}
