import java.util.Scanner;
public class Lab49ArraysReturn {
    static Scanner scan = new Scanner(System.in);
    public static int[][] readMatrix(int rows,int columns) {
        int[][] matrix = new int[rows][columns];
        for(int i = 0 ;  i<rows ; i++){
            for(int j = 0;j<columns;j++ ){
             System.out.printf("Enter element[%d,%d]: ",i+1,j+1);
             matrix[i][j] =scan.nextInt();
            }
        }return  matrix; 
    }
    public static void showMatrix(int[][] matrix) {
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                 System.out.printf("%5d",matrix[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int numRows,numCols;
        int [][] A ;
        System.out.print("How many rows : ");
        numRows = scan.nextInt();
    
        System.out.print("How many columns : ");
        numCols = scan.nextInt();
        A = readMatrix(numRows, numCols);
        System.out.println("Matrix A is");
        showMatrix(A);       
     }
}
