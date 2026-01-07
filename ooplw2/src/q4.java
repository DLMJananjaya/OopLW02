import java.util.Scanner;

public class q4 {
    public static void numberRow() {
        int[] x = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the integer " + (i + 1));
            x[i] = scanner.nextInt();

        }
        System.out.println("These are the numbers in the array ");
        for (int i = 0; i < 5; i++) {

            System.out.print(" " + x[i]);
        }
        public static void main (String[] args){

            numberRow();
        }

    }
}
