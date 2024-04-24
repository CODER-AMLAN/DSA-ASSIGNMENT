/*Question-3:
Write a Java program that takes two arrays a and b of length n storing int values, and returns
the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i],
for i = 0, . . . , n − 1.*/

import java.util.Scanner;

class H3{
    public static int[] dotProduct(int[]a,int[]b){
        int[]c = new int[a.length];
        for(int i=0;i<a.length;i++)
            c[i]=a[i]*b[i];
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int[]a=new int[n];
        int[]b=new int[n];
        System.out.print("Enter the values for array a: ");
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
        }
        System.out.print("Enter the values for array b: ");
        for(int j=0;j<n;j++){
           b[j]=sc.nextInt();
        }
        int[]c=dotProduct(a, b);
        System.out.print("The dot products of array a and b are: ");
        for (int k=0;k<n;k++) {
            System.out.print(c[k]+" ");
        }
        sc.close();
    }
}