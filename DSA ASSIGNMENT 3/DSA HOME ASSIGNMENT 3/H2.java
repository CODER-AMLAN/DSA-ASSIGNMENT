/*Question 2. 
Write a recursive method in Java to search an element of an array using binary search. */
import java.util.Scanner;

public class H2 {
    public static  int binarySearch(int[]arr,int key,int low,int high){
        if(low>high)
            return -1;
        int mid=(low+high)/2;
        if(arr[mid]<key)
            return binarySearch(arr,key,mid+1,high);
        else if(arr[mid]>key)
            return binarySearch(arr,key,low,mid-1);
        else
            return mid;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.print("Enter the sorted array: ");
        int[]arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();
        int idx = binarySearch(arr,key,0,size-1);
        if(idx==-1)
            System.out.println("Element does not exist");
        else
            System.out.println("Index of "+key+" is "+idx);
    }
}
