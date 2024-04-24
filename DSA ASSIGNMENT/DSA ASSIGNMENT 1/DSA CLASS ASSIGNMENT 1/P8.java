/*Question-8:
Write a java program to print M-by-N array in the tabular format. Also, display the sum of 
elements of the array. 
Sample Run:
Enter number of Row and Columns of 2D-Array: 3 3
Enter elements of 2D-Array: 1 2 3 2 3 4 3 4 5
The elements of 2D array are:
1 2 3
2 3 4
3 4 5
The sum of elements of the 2D-Array is 27 */

import java.util.Scanner;
public class P8 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Row and Columns of 2D-Array: ");
    int m = sc.nextInt();//takes the input for number of ROWS
    int n = sc.nextInt();//takes the input for number of COLUMNS
    int[][]arr = new int[m][n];
    int sum=0;
    System.out.print("Enter elements of 2D-Array: ");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
            sum+=arr[i][j];//sum=sum+arr[i][j]
        }
    }
    System.out.println("The elements of 2D array are:");
    for(int k=0;k<m;k++){
        for(int l=0;l<n;l++){
           System.out.print(arr[k][l]+" ");
        }
    System.out.println();
    }
    System.out.println("The sum of elements of the 2D-Array is "+sum);
    sc.close();//optional
   }    
}
