package CodeSolving_DSA;

public class RotateImage_48 {
    public void rotateMatrix(int [][] matrix){
        int n = matrix.length;

        //transpose
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse of the transpose
        for (int i=0; i<n; i++){
            int l=0;
            int r=n-1;

            while(l<r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };

        RotateImage_48 ri = new RotateImage_48();

        ri.rotateMatrix(matrix);

        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
