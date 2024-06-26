/*Question 1
 Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler.
 */

import java.util.*;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        int num = sc.nextInt();
        try{
        if(num<0){
            throw new NumberFormatException("ENTER A POSITIVE NUMBER");
        }
        System.out.println("Lucky number: "+num);
         }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        sc.close();//OPTIONAL
    }
}
