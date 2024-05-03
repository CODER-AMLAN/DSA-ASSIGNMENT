/*Define an interface DetailInfo to declare methods display( ) & count( ). Another class
Person contains a static data member maxcount, instance member name & method
display( ) to display name of a person, count the no. of characters present in the name
of the person.*/

import java.util.Scanner;

interface DetailInfo{
   void display();
   void count();
}
class Person implements DetailInfo{
     static int maxcount;
     String name;
     Person(String name){
      this.name = name;
     }
     public void display(){
        System.out.println("Name= "+name);
     }
     public void count(){
         for(int i=0;i<name.length();i++){
           if(Character.isLetter(name.charAt(i)))
                maxcount++;
         }
     }
}
public class P7 //driver class
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter the name: ");
       DetailInfo ob = new Person(sc.nextLine());
       ob.count();
       ob.display();
       System.out.println("no. of characters present in the name of the person is: "+Person.maxcount);
       sc.close();//optional
    }
  
}