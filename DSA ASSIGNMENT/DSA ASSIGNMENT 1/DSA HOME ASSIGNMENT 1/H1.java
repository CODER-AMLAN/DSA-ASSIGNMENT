/*Question-1:
Write a Java program that takes as input three integers, a, b, and c, from the Java console
and determines if they can be used in a correct arithmetic formula (in the given order), like
“a + b = c,” “a = b − c,” or “a b = c.”∗ */

import java.util.Scanner;

class H1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number:  ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        if((a+b)==c || a==(b-c) || (a*b)==c)
           System.out.println("Yes the numbers can be used in a correct arithmetic formula");
        else
           System.out.println("NO, the numbers cannot be used in correct arithmetic formula");
        sc.close();//optional      
    }
}