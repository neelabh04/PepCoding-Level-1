// Spiral Display of a Matrix

public class spiralDisplay {
    public void solution(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;

        int minRowIdx = 0;
        int minColIdx = 0;
        
        int maxRowIdx = arr.length - 1;
        int maxColIdx = arr[0].length - 1;
        
        int totalElements = rows * cols;
        int count = 0;
        
        while(count < totalElements){
            // left wall
            for(int i = minRowIdx, j = minColIdx; i <= maxRowIdx && count < totalElements; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minColIdx++;
            // bottom wall
            for(int i = maxRowIdx, j = minColIdx; j <= maxColIdx && count < totalElements; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxRowIdx--;
            // right wall
            for(int i = maxRowIdx, j = maxColIdx; i >= minRowIdx && count < totalElements; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxColIdx--;
            // top wall
            for(int i = minRowIdx, j = maxColIdx; j >= minColIdx && count < totalElements; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minRowIdx++;
        }
    }
}
