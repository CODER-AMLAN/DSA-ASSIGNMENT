/*1. Define a class Person with two instance variables:
 name and age
and two member methods:
 setData(): set the details of the person.
 displayData(): display the details of the person.
Now, create two objects of class person and initialize one object value directly (by
using the dot(.) operator name: “Rohan” and age: 20 ). Accept your name and age
through the keyboard and set them to another object using the setData() method.
Now display both the member variables using the displayData() method. Also, check
who is younger. */

import java.util.Scanner;
class P1_Person{
    String name;
    int age;
    void setData(String n , int a){
         name = n;
         age = a ;
    }
    void displayData(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        P1_Person ob1 = new P1_Person();
        ob1.name = "Rohan";
        ob1.age = 20;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.print("Enter age: ");
        int a = sc.nextInt();
        P1_Person ob2 = new P1_Person();
        ob2.setData(n, a);
        ob1.displayData();
        ob2.displayData();
        if(ob1.age<ob2.age)
            System.out.println(ob1.name+" is younger.");
        else
             System.out.println(ob2.name+" is younger.");
        sc.close();//optional
    }
}
//while writing the code replace P1_Person with Person, as the class name should be Person(instructed in the question)