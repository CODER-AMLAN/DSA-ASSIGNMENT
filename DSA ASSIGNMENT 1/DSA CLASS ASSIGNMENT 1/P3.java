/*Question-3:
Write a java program to check whether a number is a spy number or not. 

Example:
N = 132
Sum of digit of N = 1 + 3 + 2 = 6
Product of digit of N = 1 × 3 × 2 = 6
So, 132 is a spy number.

Sample Run:
Enter a number: 1124
1124 is a spy number. */

import java.util.*;
public class P3 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int n = sc.nextInt();
         int n1=n,p=1,s=0;
         while(n>0){
            s+=n%10;//s=s+n%10
            p*=n%10;//p=p*n%10
            n/=10;//n=n/10
         }
         if(s==p)
           System.out.println(n1+" is a spy number.");
        else
          System.out.println(n1+" is not a spy number");
        sc.close();//(optional)
     }   
}
