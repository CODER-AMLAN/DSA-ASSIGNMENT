import java.util.Scanner;
//DSA ASSIGNMENT 3 QUESTION 3
class MarksOutOfBoundException extends RuntimeException{
    MarksOutOfBoundException(String s){
        super(s);
    }
}
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        double mark = sc.nextDouble();
       try{
        if(mark>100){
            throw new MarksOutOfBoundException("MARKS CANNOT BE MORE THAN 100");
        } 
    }
    catch(MarksOutOfBoundException e){
        System.out.println(e);
    }  
     sc.close();
    }
}
