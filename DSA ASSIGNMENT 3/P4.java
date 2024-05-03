/*Question 4
Write a simple main class in Java that contains an experiment that uses the generic Box<T>
class to build boxes with different types and that verifies that this class works as advertised.
Your experiment should include the following:
 Create a boxed String object and two variables that refer to that box. Change the contents
of one and determine the effect on the other.
 Create a boxed Integer object and two variables that refer to that box. Change the
contents of one and determine the effect on the other.
 Create a boxed Object object and two variables that refer to that box. Determine what
happens if you put a string in the box. Determine what happens if you put an integer in
the box.*/

class Box<T> {
    T var;// variable of type T

     void set(T var){
        this.var = var;
     }

    public T get() {
        return var;
    }
}

public class P4{
    public static void main(String[] args) {
        // Create a boxed String object and two variables that refer to that box.
        Box<String> stringBox = new Box<>();
        Box<String> stringBoxRef1 = stringBox;
        Box<String> stringBoxRef2 = stringBox;

        // Change the contents of one and determine the effect on the other.
        stringBoxRef1.set("Hello");
        System.out.println("stringBoxRef2 contents: " + stringBoxRef2.get());

        // Create a boxed Integer object and two variables that refer to that box.
        Box<Integer> intBox = new Box<>();
        Box<Integer> intBoxRef1 = integerBox;
        Box<Integer> intBoxRef2 = integerBox;

        // Change the contents of one and determine the effect on the other.
        intBoxRef1.set(123);
        System.out.println("intBoxRef2 contents: " + intBoxRef2.get());

        // Create a boxed Object object and two variables that refer to that box.
        Box<Object> objectBox = new Box<>();
        Box<Object> objectBoxRef1 = objectBox;
        Box<Object> objectBoxRef2 = objectBox;

        // Determine what happens if you put a string in the box.
        objectBoxRef1.set("Hello");
        System.out.println("objectBoxRef2 contents: " + objectBoxRef2.get());

        // Determine what happens if you put an integer in the box.
        objectBoxRef1.set(123);
        System.out.println("objectBoxRef2 contents: " + objectBoxRef2.get());
    }
}
