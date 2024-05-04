/*Question 8. 
Write a recursive method in Java which, given real value x and a positive integer n, returns
the value of x to the power n 
*/
import java.util.*;
public class P8 {
    public static double power(double x,int n){
        if(n==0)
           return 1;
        else
          return x*power(x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();
        System.out.print("Enter a positive integer value of n: ");
        int n = sc.nextInt();
        System.out.println(x+" to the power "+n+" is: "+power(x, n));
        sc.close();//optional
    }
}
