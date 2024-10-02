import java.util.Scanner;

public class IT24102369Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfSquares = 0;
        int count = 0;

        System.out.println("Enter numbers (terminate with -99):");
        while (true) {
            int number = scanner.nextInt();
            if (number == -99) {
                break;
            } else if (number < 0) {
                System.out.println("Invalid input, please enter a positive number.");
            } else {
                sumOfSquares += number * number;
                count++;
            }
        }

        if (count > 0) {
            double rms = Math.sqrt((double) sumOfSquares / count);
            System.out.println("Root Mean Square: " + rms);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}
