/*Question 6.
 Write a recursive Java method that determines if a string s is a palindrome, that is, it is
equal to its reverse. Examples of palindromes include 'racecar' and
'gohangasalamiimalasagnahog'.
 */
import java.util.Scanner;
public class H6 {
	public static boolean checkPalindrome(String s,int i,int f){
		  if(i==f||(i+f)!=s.length())
		       return s.charAt(i)==s.charAt(f);
		    if(s.charAt(i)!=s.charAt(f))
		       return false;
		   else
		        return  checkPalindrome(s,i+1,f-1);
		}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in) ;
	    System.out.print("Enter the String: ");
	    String s = sc.nextLine();
	      if(checkPalindrome(s,0,s.length()-1))
	          System.out.println("Palindrome.");
	          else
	             System.out.println("Not a Palindrome.");
	}
}
//WILL BE UPLOADED SOON... 