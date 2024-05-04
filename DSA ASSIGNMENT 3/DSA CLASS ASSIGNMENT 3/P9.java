/*Question 9
Write a recursive method in Java which, given an integer n, print it with its digits reversed.
For example , given 4735, it prints 5374 */

import java.util.Scanner;

public class P9 {
    public static int reverse(int n,int l){
        if(n<10)
            return n;
        else{
            return n%10*(int)(Math.pow(10, l))+reverse(n/10, l-1);

    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int l = (String.valueOf(n)).length();
        System.out.println("Reverse of "+n+" is "+ reverse(n,l-1));
        sc.close();//OPTIONAL
    }
}
