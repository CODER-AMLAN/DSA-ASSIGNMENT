/*Question 7
Write a recursive method in Java that computes the factorial of a given integer. */

import java.util.Scanner;

public class P7 {
    public static int factorial(int num){
        if(num<=1)
           return 1;
        else
           return num*factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is "+factorial(n));
        sc.close();//optional
    }            
}
