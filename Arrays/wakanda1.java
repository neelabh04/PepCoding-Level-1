package Arrays;

// State of Wakanda - 1 (Wave Display)

public class wakanda1 {
    public void waveDisplay(int[][] arr){
        for(int j = 0; j < arr[0].length; j++){
            if(j % 2 ==0){
                for(int i = 0; i < arr.length; i++){
                    System.out.println(arr[i][j]);
                }
            }else{
                for(int i = arr.length; i >= 0; i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
