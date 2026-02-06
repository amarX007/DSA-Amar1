package CodeSolving_DSA;

public class SetMatrixZeros_73 {
    public static void setZeros(int [][]matrix){

        int rows = matrix.length;
        int columns = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        //check if first column has any zero
        for (int i=0; i<columns; i++){
            if (matrix[0][i] == 0){
                firstRowZero = true;
                break;
            }
        }

        //check if first row has any zero
        for (int j=0; j<rows; j++){
            if (matrix[j][0] == 0){
                firstColZero = true;
                break;
            }
        }

        //mark zeros in rows and cols
        for (int i=1; i<rows; i++){
            for (int j=1; j<columns; j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //set zeros based on mark
        for (int i=1; i<rows; i++){
            for (int j=1; j<columns; j++){
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        //first row
        if (firstRowZero){
            for (int i=0; i<columns; i++){
                matrix[0][i] = 0;
            }
        }

        //first cols
        if (firstColZero) {
            for (int j = 0; j < rows; j++) {
                matrix[j][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        setZeros(matrix);

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
