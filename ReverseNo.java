import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        
        int reversedNumber = reverse(number);
        System.out.println("The reverse of the number is: " + reversedNumber);
    }
    
    public static int reverse(int number) {
        String numberString = String.valueOf(number);
        String reversedString = "";
        
        // Reversing the string representation of the number
        for (int i = numberString.length() - 1; i >= 0; i--) {
            reversedString += numberString.charAt(i);
        }
        
        // Parsing the reversed string back to integer
        int reversedNumber = Integer.parseInt(reversedString);
        
        return reversedNumber;
    }
}
