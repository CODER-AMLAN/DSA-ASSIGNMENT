/*Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, 
and finds the first row and column with the most 1s.
Sample run:
0 0 1 1
0 0 1 1
1 1 0 1
1 0 1 0
The largest row index: 2
The largest column index: 2 */

import java.util.Scanner;

public class H5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]arr = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=(int)(Math.random()*(1-0+1)+0);//Math.random()*((max_value-min_value+1)+min_value)
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
            System.out.println();
        }
        int rowIdx=0,colIdx=0,max=0,count=0;
        for(int row=0;row<4;row++){
            for(int col=0;col<4;col++){
                if(arr[row][col]==1)
                   count++;
            }
         if(count>max){
            max=count;
            rowIdx=row;
         }
         count=0;
        }
        max=0;
        for(int col=0;col<4;col++){
            for(int row=0;row<4;row++){
                if(arr[row][col]==1)
                count++;
            }
            if(count>max){
                max=count;
                colIdx=col;
             }
         count=0;
        }
        System.out.println("The largest row index: "+rowIdx);
        System.out.println("The largest column index: "+colIdx); 
        sc.close();//optional 
    }
}
