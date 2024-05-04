/*Question 6. 
Write a java method using Generics to count the occurrence of an element in an array of
any type. The signature of count method is given below.
                     public static <T> int count(T[] array, T item)   
*/
public class P6 {
     public static <T> int count(T[] array, T item){
        int count = 0;   
        for(T element: array){
            if(element.equals(item))
                count++;
        }
        return count; 
     }
     public static void main(String[] args) {
        Integer[] int_arr = {1,2,3,2,4,6,2,7,8,9,10,2};
        System.out.println("Occurence of element 2 in the Integer array is: "+ count(int_arr, 2));
        Double[] double_arr = {1.2,2.5,3.6,2.5,4.8,6.79,2.5,7.3,8.0,9.9,10.1,2.3};
        System.out.println("Occurence of element 2.5 in the Double array is: "+ count(double_arr, 2.5));
        Character[] char_arr = {'a','b','c','a','a','d','e'};
        System.out.println("Occurence of element a in the Character array is: "+ count(char_arr, 'a'));
        String[] string_arr = {"Hello","World","Hello","Raju","Rani"};
        System.out.println("Occurence of element Hello in the String array is: "+ count(string_arr, "Hello"));
     }
    
}
