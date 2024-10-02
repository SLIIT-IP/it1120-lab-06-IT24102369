import java.util.Scanner;

public class IT24102369Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
