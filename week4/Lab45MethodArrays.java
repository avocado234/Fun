public class Lab45MethodArrays {
    public static void showMatrix(int[][] A) {
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[i].length;j++){
                 System.out.printf("%5d",A[i][j]);
            }
            System.out.println("");
        }

    }
    public static void showAddMatrix(int[][] A,int[][] B) {
        int i, j;
        int C[][] = new int[2][3];
 
        for (i = 0; i < 2; i++){
            for (j = 0; j < 3; j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.printf("%5d",C[i][j]);
 
    }
        System.out.println("");
    }
}
    public static void main(String[] args) {
        int[][] A = {
                { -3, 5, 6},
                { 5, 0, -2}
                
        };
        int[][] B ={
                { 9, 0, -5},
                { -3, -2, -1}
        };
        System.out.println("Merix A : ");
        showMatrix(A);
        System.out.println("Metris B : ");
        showMatrix(B);
        System.out.println("Mertix A+B : ");
        showAddMatrix(A,B);
    }
}
