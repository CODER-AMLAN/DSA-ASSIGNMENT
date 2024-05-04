/*Question 10
The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers,
each is the sum of the preceding two. Write a recursive method in Java which, given n,
returns the nth Fibonacci number.
*/

import java.util.Scanner;

public class P10 {
    public static int Fibonacci(int count,int a,int b,int n){
        if(count==n){
            return b;
        }
        else{
            return Fibonacci(count+1,b,a+b,n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("The "+n+"th term of the Fibonacci series is: "+Fibonacci(2,1,1,n));
        sc.close();//OPTIONAL         
    }
}
