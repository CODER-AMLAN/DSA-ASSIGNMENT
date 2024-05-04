/*Question 5.
 Write a recursive Java method that takes a character string s and outputs its reverse. For
example, the reverse of 'pots&pans' would be 'snap&stop'.
 */

import java.util.Scanner;

public class H5 {
    public static String reverse(String s,int l){
        if(l==0){
            return ""+s.charAt(l);
        }
        else
           return s.charAt(l)+reverse(s, l-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Reverse of: '"+s+"'' would be '"+reverse(s,s.length()-1)+"'.");
        sc.close();//OPTIONAL
    }
}
