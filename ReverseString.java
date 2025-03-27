import java.util.Scanner;

public class ReverseString{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter a string to reverse:      "    );
        String input = scanner.nextLine();

        String reversed = reverseString (input);
        System.out.println("Reversed String :   "+ reversed);
        scanner.close();

    }

    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();

    }
}