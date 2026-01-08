import java.util.*;

public class q5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text to check");
        String input = scanner.nextLine();

        String delimiters = " ,.!?;:'\"-@";
        StringTokenizer token = new StringTokenizer(input, delimiters);

        StringBuilder cleanString = new StringBuilder();

        while (token.hasMoreTokens()) {

            cleanString.append(token.nextToken().toLowerCase());
        }


        String original = cleanString.toString();

        String reversed = cleanString.reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("Result: It IS a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }


    }

}
