public class rotateby90 {
    public void solution(int[][] arr){
        // transpose of a matrix
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        // swapping the elements in a row
        for(int i = 0; i < arr.length; i++){
            int leftIndex = 0;
            int rightIndex = arr[0].length - 1;
            
            while(leftIndex < rightIndex){
                int temp = arr[i][leftIndex];
                arr[i][leftIndex] = arr[i][rightIndex];
                arr[i][rightIndex] = temp;
                
                leftIndex++;
                rightIndex--;
            }
        }
    }
}
