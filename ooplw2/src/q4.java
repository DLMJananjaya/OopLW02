import java.util.Scanner;

public class q4 {
    public static void numberRow() {
        int[] x = new int[5];
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the integer " + (i + 1));
            x[i] = scanner.nextInt();
            if(x[i]>largest ) {
                secondlargest=largest;
                largest = x[i];
            }
        if(x[i] >secondlargest && x[i] != largest){
                secondlargest = x[i];
        }
        }
        System.out.println("These are the numbers in the array");
        for (int i = 0; i < 5; i++) {

            System.out.print(" " + x[i]);
        }
        System.out.println("These are the numbers in the array  \n largest "+largest);
        System.out.println("These are the numbers in the array  \n Secondlargest "+secondlargest);
    }
        public static void main (String[] args){

            numberRow();
        }

}

