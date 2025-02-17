package Exp2;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctElements {
    public static void findDistinct(int[] arr) {
        HashSet<Integer> distinctSet = new HashSet<>();
        
        System.out.println("Distinct elements in the array:");
        for (int num : arr) {
            if (!distinctSet.contains(num)) {
                System.out.print(num + " "); // Print if it's a new element
                distinctSet.add(num); // Add to the set
            }
        }
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
        findDistinct(arr);
    }
}
