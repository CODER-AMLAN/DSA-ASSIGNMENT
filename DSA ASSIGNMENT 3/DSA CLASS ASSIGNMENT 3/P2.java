/*Question 2. 
Assign your favorite colors in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java.*/

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String[] color = { "Violet", "Black", "Green", "Blue", "Yellow" };
            System.out.println("Enter index: ");
            int idx = sc.nextInt();
            if (idx < 0)
                throw new NumberFormatException("Index cannot be negative");
            System.out.print("Colour at index " + idx + " is: " + color[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        sc.close();//OPTIONAL
    }
}
