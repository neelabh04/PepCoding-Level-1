// Climb stairs with minimum moves
public class climbStairsMinMove {
    public int solution(int[] arr){
        
        int size = arr.length;
        Integer[] dp = new Integer[size + 1];
        
        dp[size] = 0;

        for(int i = arr.length; i >= 0; i--){
            if(arr[i] > 0){
                int min = Integer.MAX_VALUE;
                for(int j = 1; j <= arr[i] && i + j < dp.length; j++){
                    if(dp[i + j] != null){
                        dp[i] = Math.min(dp[i + j], min);
                    }

                    if(dp[i] != Integer.MAX_VALUE){
                        dp[i] = min + 1;
                    }
                }
            }
        }

        return dp[0];
    }
}
