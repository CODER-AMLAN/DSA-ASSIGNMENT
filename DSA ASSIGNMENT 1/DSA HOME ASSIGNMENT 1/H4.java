/* Question-4:
Write a method to add two matrices. The header of the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the same or
compatible types of elements.*/

import java.util.Scanner;

public class H4 {
    public static double[][] addMatrix(double[][] a, double[][] b){
        int size=a.length;
        double[][]sum = new double[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        return sum;  
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size of n x n matrices: ");
         int size = sc.nextInt();
         System.out.println("Enter the elements of matrix a: ");
         double[][]a=new double[size][size];
         for(int row=0;row<size;row++){
            for(int col=0;col<size;col++){
                a[row][col]=sc.nextDouble();
            }
         }
         System.out.println("Enter the elements of matrix b: ");
         double[][]b=new double[size][size];
         for(int row=0;row<size;row++){
            for(int col=0;col<size;col++){
                b[row][col]=sc.nextDouble();
            }
         }
         double [][]sum= addMatrix(a, b);
         System.out.println("sum of the maatrices a and b: ");
        for(int row=0;row<size;row++){
            for(int col=0;col<size;col++){
                System.out.print(sum[row][col]+"\t");
            }
            System.out.println();
         }
         sc.close();
       }
}
