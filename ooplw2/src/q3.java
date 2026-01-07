import java.util.Scanner;

public class q3 {
    public static void pattern(int i){
        int n=0;

        while (n<i){

            for (int p = 1; p <= i - n; p++) {
                System.out.print(" ");
            }

            for(int j=0;2*n>=j;j++){


                System.out.print("*");

            }
            System.out.println();
            n++;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rows do u need?");
        int x = scanner.nextInt();
        pattern(x);
        scanner.close();
    }
}
