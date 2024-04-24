/*Write a java method to calculate the sum of digits of a given number until the number is a 
single digit. The method signature is as follows.
public static int sum_Of_Digits(int n)

Example:
 Let n = 9294
 Sum = 9 + 2 + 9 + 4 = 24
 Sum = 2 + 4 = 6

 Sample Run:
Enter a number 9294
Sum of digits of 9294 until the number is a single digit is 6*/

import java.util.Scanner;
public class P5 {
    public static int sum_Of_Digits(int n){
        int s=0;
        if(n<10)
           return n;
        while(n>0){
            s+=n%10;//s=s+n%10
            n/=10;//n=n/10
        }
        return sum_Of_Digits(s);   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits of "+n+" until the number is a single digit is "+sum_Of_Digits(n));
        sc.close();//(optional)
   }
}
