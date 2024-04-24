/*Question-7:
Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs.

Sample Run:
Enter number of elements of Array: 5
Enter elements of the array: 12 14 12 14 13
Maximum element of Array is 14 and occurs 2 times.
Minimum element of Array is 12 and occurs 2 times.
First occurrence of maximum element is at position 2.
Last occurrence of minimum element is at position 3. */

import java.util.Scanner;
public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements of Array: ");
        int size = sc.nextInt();
        int[]arr = new int[size];
        System.out.print("Enter elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0],min=arr[0];
       for(int j=1;j<size;j++){
         if(max<=arr[j])//12 14 12 14 13
            max=arr[j];
         if(min>=arr[j])
            min=arr[j];
       }
       int countMax=0,countMin=0,maxOccurence=0,minOccurence=0;
       boolean b=true;
       for(int k=0;k<size;k++){
          if(arr[k]==max){
             countMax++;
            if(b){
                maxOccurence=k+1;
                b=false;
            }
            }
          if(arr[k]==min){
              countMin++;
              minOccurence=k+1; 
          }
       }
       System.out.println("Maximum element of Array is "+max+" and occurs "+countMax+" times.");
       System.out.println("Minimum element of Array is "+min+" and occurs "+countMin+" times.");
       System.out.println("First occurrence of maximum element is at position "+maxOccurence+".");
       System.out.println("Last occurrence of minimum element is at position "+minOccurence+".");
    sc.close();//optional
    }
}
