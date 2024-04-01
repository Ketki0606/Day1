import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (4 digits): ");
        int year = scanner.nextInt();

        if (year < 1000 || year > 9999) {
            System.out.println("Invalid input! Please enter a 4-digit year.");
            return;
        }

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4,
        // but not divisible by 100 unless it is also divisible by 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
