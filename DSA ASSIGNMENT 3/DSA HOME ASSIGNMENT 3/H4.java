/*Question 4. 
Write a recursive method in Java to find the product of 2 numbers. */

import java.util.Scanner;

public class H4 {
    
    public static int product(int n1,int n2,int prod) {
            if(n2==0 || n1==0){
                return prod;
            }
            else
              return product(n1, n2-1,prod+n1);   
    }
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the 1st number: ");
           int n1 = sc.nextInt();
           System.out.print("Enter the 2nd number: ");
           int n2 = sc.nextInt();
           System.out.println("Product of "+n1+" and "+n2+" is: "+product(Math.max(n1, n2),Math.min(n1,n2),0));
           sc.close();//OPTIONAL
    }
}
