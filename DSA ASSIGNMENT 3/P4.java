/*Write a simple main class in Java that contains an experiment that uses the generic Box<T>
class to build boxes with different types and that verifies that this class works as advertised.
Your experiment should include the following:
 Create a boxed String object and two variables that refer to that box. Change the contents
of one and determine the effect on the other.
 Create a boxed Integer object and two variables that refer to that box. Change the
contents of one and determine the effect on the other.
 Create a boxed Object object and two variables that refer to that box. Determine what
happens if you put a string in the box. Determine what happens if you put an integer in
the box.*/

class Box<T>{
    T var;//variable of type T
    Box(T var){
       this.var = var;
    }
    void displayBeforeChange(){
        System.out.println(var);
    }
    void displayAfterChange(){
        System.out.println(var+"\n");
    }
}
class P4{
    
    public static void main(String[] args) {
        //Create a boxed String object and two variables that refer to that box.
        Box<String> stringOb = new Box<>("Hello");
        Box<String> stringRef1 = stringOb;
        Box<String> stringRef2 = stringOb;
        // Change the contents of one and determine the effect on the other.
        System.out.print("stringRef1 contents before change: ");
        stringRef1.displayBeforeChange();
        System.out.print("stringRef1 contents after change: ");
        stringRef1 = new Box<>("World");
        stringRef1.displayAfterChange();
        
        //Create a boxed Integer object and two variables that refer to that box.
        Box<Integer> intOb = new Box<>(123);
        Box<Integer> intRef1 = intOb;
        Box<Integer> intRef2 = intOb;
        // Change the contents of one and determine the effect on the other.
        System.out.print("intRef1 contents before change: ");
        intRef1.displayBeforeChange();
        System.out.print("intRef1 contents after change: ");
        intRef1 = new Box<>(321);
        intRef1.displayAfterChange();
 
        //Create a boxed String object and two variables that refer to that box.
        Box<Object> objectOb = new Box<>("Hello");
        Box<Object> objectRef1 = objectOb;
        Box<Object> objectRef2 = objectOb;
        // Change the contents of one and determine the effect on the other.
        System.out.print("objectRef1 contents before change: ");
        objectRef1.displayBeforeChange();
        System.out.print("objectRef1 contents after change: ");
        objectRef1 = new Box<>(123);
        objectRef1.displayAfterChange();
 
    }
}