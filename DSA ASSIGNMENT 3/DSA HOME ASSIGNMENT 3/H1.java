/*Question 1. 
Write a recursive method in Java to return the greatest common divisor(gcd) of two integers m
and n, given that in general, gcd(m,n)=gcd(n, m mod n). */

import java.util.Scanner;

public class H1 {
    public static int gcd(int m, int n) {
        if (n == 0)
            return m;
        else
            return gcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("GCD of " + m + " and " + n + " is: " + gcd(m, n));
        sc.close();// OPTIONAL
    }
}