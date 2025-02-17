package Exp1;
import java.util.Scanner;

public class FactorialRecursion {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base case
        }
        return n * factorial(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
