import java.util.Scanner;

public class NaturalNumber
 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        
        if (n < 0) 
        {
            System.out.println("Invalid input! Please enter a non-negative integer.");
        } 
        else 
        {
            int sum = 0;
            for (int i = 1; i <= n; i++) 
            {
                sum += i;
            }
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }
}
