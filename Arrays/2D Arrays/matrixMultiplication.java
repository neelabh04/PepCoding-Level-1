// Matrix Multiplication

public class matrixMultiplication {
    public void solution(int[][] mat1, int[][] mat2){
        if(mat1[0].length != mat2.length){
            System.out.println("Invalid input");
        }

        int rows = mat1.length;
        int cols = mat2[0].length;

        int[][] prod = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                for(int k = 0; k < mat1.length; k++){
                    prod[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
    }
}
