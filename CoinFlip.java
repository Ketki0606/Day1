import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = scanner.nextInt();

        if (numFlips <= 0) {
            System.out.println("Number of flips should be a positive integer.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < numFlips; i++) {
            double randomValue = Math.random(); // Generates a random number between 0 and 1

            // If random value is less than 0.5, consider it as heads, otherwise consider it as tails
            if (randomValue < 0.5) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        double headsPercentage = (double) headsCount / numFlips * 100;
        double tailsPercentage = (double) tailsCount / numFlips * 100;

        System.out.println("Percentage of Heads: " + headsPercentage + "%");
        System.out.println("Percentage of Tails: " + tailsPercentage + "%");
    }
}
