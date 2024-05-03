class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person{
    int eID;
    double salary;
    Employee(String name, int age, int eID, double salary){
        super(name, age);
        this.eID=eID;
        this.salary=salary;
    }
    void empDisplay(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(eID);
        System.out.println(salary);
    } 
}

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee("AMLAN", 19, 0234, 50000);
        e.empDisplay();
    }
}
