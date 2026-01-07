import java.util.*;

public class q2 {
    public static int output(int number){
        if(number == 0){
            return 1;
        }
        int count= 0;

        while (number>=1){
            number = number / 10;
            count++;
        }
        return count;


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers to count their digits.");
        System.out.println("Enter a negative number to stop.");
        boolean positive = true;
        while (positive){
            System.out.println("Enter the integer");
            int input = scanner.nextInt();

            if(input<0){
                System.out.println("Invalid number");
                positive = false;
            }

            int counter = output(input);
            System.out.println("No of digits "+ counter);
            System.out.println();

        }

    }
}


