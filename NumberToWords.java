import java.util.*;

public class NumberToWords {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single digit number: ");
        int number = sc.nextInt();
        
        if (number >= 0 && number <= 9)
        {
           
        switch (number)
         {
                case 0:
                System.out.println("one");
                    break;
                case 1:
                System.out.println("two");
                    break;
                case 2:
                System.out.println("three");
                    break;
                case 3:
                System.out.println("four");
                    break;
                case 4:
                System.out.println("Five");
                    break;
                case 5:
                System.out.println("Six");
                    break;
                case 6:
                System.out.println("Seven");
                    break;
                case 7:
                System.out.println("Eight");
                    break;
                case 8:
                System.out.println("nine");
                    break;
                case 9:
                   System.out.println("nine");
                    break;
            }
            
        } 
        else
        {
            System.out.println("Invalid input! Please enter a single digit number.");
        }
    }
}
