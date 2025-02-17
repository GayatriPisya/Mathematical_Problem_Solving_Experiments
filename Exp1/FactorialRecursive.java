package Exp1;
import java.util.Scanner;
public class FactorialRecursive{
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n* factorial(n-1);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int nub = sc.nextInt();
        
        sc.close();
        System.out.println("Factorial of number "+ nub+ " is "+factorial(nub));
       
    }

}