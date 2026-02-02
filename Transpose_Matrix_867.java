package CodeSolving_DSA;

public class Transpose_Matrix_867 {
    public static int [][] transposeMatrix(int [][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int [][] result = new int [cols][rows];

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] ans = transposeMatrix(matrix);

        for (int i=0; i<ans.length; i++){
            for (int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
