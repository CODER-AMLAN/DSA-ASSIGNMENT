/*Question 3. 
Write a recursive method in Java to find the binary equivalent of a positive decimal integer.*/

import java.util.Scanner;

public class H3 {
    public static int toBinary(int n) {
        if (n <= 1)
            return n;
        else
            return toBinary(n / 2) * 10 + (n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        System.out.println("The binary equivalent of " + num + " is: " + toBinary(num));
        sc.close();// OPTIONAL
    }
}
