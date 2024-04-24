/*Write a Java program that takes all the lines input to standard input and writes them to
standard output in reverse order. That is, each line is output in the correct order, but the
ordering of the lines is reversed.*/

import java.util.Scanner;

public class H2 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of lines: ");
    int n=sc.nextInt();
    sc.nextLine();//consumes the leftover new line 
    String[]arr = new String[n];
    System.out.println("Enter the lines: ");
    for(int i=0;i<n;i++)
      arr[i]=sc.nextLine();
    System.out.println("Lines in reverse order: ");
    for(int j=n-1;j>=0;j--)
       System.out.println(arr[j]);
  sc.close();//optional
 }    
}

/*when we enter the value for number of lines and press enter, in this case two things are entered
 one is the number and a new line character which is created when we press enter.
 So,to consume the left over new line character the statement: sc.nextLine() has been written after
 the statement int n = sc.nextInt();

 if we donot consume the new line character then it will get consumed inside the loop where
 the lines are getting stored and we can only input n-1 lines(as arr[0] will store the new line character) 
*/