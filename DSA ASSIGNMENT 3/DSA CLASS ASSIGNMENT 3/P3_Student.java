/*Question 3. 
Create a class Student & enter mark, name of the student. If mark is more than 100, create
exception MarksOutOfBoundException & throw it using Java*/

import java.util.Scanner;
class MarksOutOfBoundException extends RuntimeException {
    MarksOutOfBoundException(String s) {
        super(s);
    }
}
public class P3_Student {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        double mark = sc.nextDouble();
        try {
            if (mark > 100) {
                throw new MarksOutOfBoundException("MARKS CANNOT BE MORE THAN 100");
            }
            System.out.println("Name: "+ name);
            System.out.println("Marks obtained: " + mark);
        } catch (MarksOutOfBoundException e) {
            System.out.println(e);
        }
        sc.close();//OPTIONAL
    }
}
//NOTE: change the class name from P3_Student to Student(as per the question),while writing the code.