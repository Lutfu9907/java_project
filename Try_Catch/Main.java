package Try_Catch;

public class Main {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 50 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally bloğu");
        }
    }
}