import java.util.*;
public class TwoDArray{
    public static void main(String[] args){
        // int[][] arr=new int[3][3];
        int[][] arr={{1,2},{4,5},{8,4},{2,9}};
        int rows=arr.length;
        int cols=arr[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number of rows: ");
        // int row=sc.nextInt();
        // System.out.println("enter the number of cols: ");
        // int col=sc.nextInt();
        // int[][] brr= new int[row][col];
        // System.out.println("Enter the values row by row:");
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {
        //         brr[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("The 2D array is:");
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {
        //         System.out.print(brr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Jagged array with user input (different columns per row)
        // System.out.println("\n--- Jagged Array Input ---");
        // System.out.print("Enter the number of rows: ");
        // int jaggedRows = sc.nextInt();
        // // Allocate only rows initially
        // int[][] jagged = new int[jaggedRows][];
        // // For each row, ask user how many columns
        // for (int i = 0; i < jaggedRows; i++) {
        //     System.out.print("Enter number of columns for row " + (i + 1) + ": ");
        //     int jaggedCols = sc.nextInt();
        //     jagged[i] = new int[jaggedCols]; // allocate columns for this row
        //     System.out.println("Enter " + jaggedCols + " values for row " + (i + 1) + ":");
        //     for (int j = 0; j < jaggedCols; j++) {
        //         jagged[i][j] = sc.nextInt();
        //     }
        // }
        // // Print jagged array
        // System.out.println("The jagged 2D array is:");
        // for (int i = 0; i < jagged.length; i++) {
        //     for (int j = 0; j < jagged[i].length; j++) {
        //         System.out.print(jagged[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        // //Sum of elements
        // int sum=0;
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         sum=sum+arr[i][j];
        //     }
        // }
        // System.out.println("Sum: "+sum);
        
        // //Product of elements
        // int pro=1;
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         pro=pro*arr[i][j];
        //     }
        // }
        // System.out.println("Product: "+pro);

        // maximum and minimum values in the matrix
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Maximum element is: "+ max);
        System.out.println("Minimum element is: "+ min);
    }
}