import java.util.Scanner;

public class Unit 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1, 10, 100, or 1000): ");
        int number = scanner.nextInt();
        
        if (number == 1 || number == 10 || number == 100 || number == 1000) 
        {
            int units, tens, hundreds, thousands;
            
            // Extracting place values
            units = number % 10;
            tens = (number / 10) % 10;
            hundreds = (number / 100) % 10;
            thousands = (number / 1000) % 10;
            
            // Displaying place values
            System.out.println("Units: " + units);
            System.out.println("Tens: " + tens);
            System.out.println("Hundreds: " + hundreds);
            System.out.println("Thousands: " + thousands);
        } 
        else 
        {
            System.out.println("Invalid input! Please enter 1, 10, 100, or 1000.");
        }
    }
}
