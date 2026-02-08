package CodeSolving_DSA;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix_54 {
    public static List<Integer> spiralMatrix(int [][]matrix){
        List<Integer> result = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0;
        int right = row-1;
        int left = 0;
        int bottom = col-1;


        while (top <= bottom && left <= right){

            //top row
            for (int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            //right column
            for (int j=top; j<=bottom; j++){
                result.add(matrix[j][right]);
            }
            right--;

            //bottom row
            if (top<=bottom){
                for (int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //left column
            if (left <= right){
                for (int j=bottom; j>=top; j--){
                    result.add(matrix[j][left]);
                }
                left++;
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

        List<Integer> res = spiralMatrix(matrix);

        System.out.println(res);
    }
}
