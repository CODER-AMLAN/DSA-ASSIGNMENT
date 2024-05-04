/*Question 5. 
Write a java program to print an array of different type using a single Generic method. The
signature of printArray method is given below
     public static < E > void printArray( E[] inputArray)
*/
public class P5{
    public static <E> void print_array(E[] inputArray){
            for(int i=0;i<inputArray.length;i++)
                System.out.print(inputArray[i]+" ");
            System.out.println();
    } 
    public static void main(String[] args) {
        Integer[]arr1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Array of type Integer: ");
        print_array(arr1);
        Double[]arr2= {1.0,2.0,2.123,3.6,2.5,3.7};
        System.out.print("Array of type Double: ");
        print_array(arr2);
        Character[]arr3 = {'H','E','L','L','O'};
        System.out.print("Array of type Character: ");
        print_array(arr3);
        String[]arr4 = {"Hello","World","Raju","Rani"};
        System.out.print("Array of type String: ");
        print_array(arr4);
        Object[]arr5 = {"Hello",123,321.5,'e'};
        System.out.print("Array of type Object: ");
        print_array(arr5);        
    }  
}
