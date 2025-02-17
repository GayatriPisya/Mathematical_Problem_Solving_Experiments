package Exp2;
import java.util.Scanner;

public class LargestNumber {
    public static int findLargest(int[] arr) {
        int max = arr[0]; // Assume first element is the largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        System.out.println("Largest number in the array: " + findLargest(arr));
    }
}
