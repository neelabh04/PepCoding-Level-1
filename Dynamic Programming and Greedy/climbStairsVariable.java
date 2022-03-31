// Climb Stairs with Variable Jumps

public class climbStairsVariable {
    public int solution (int[] arr){
        size = arr.length;
        int[] dp = new int[size + 1];
        dp[size] = 1;
        for(int i = size - 1; i >= 0; i--){
            for(int j = 1; j <= arr[i] && i + j < dp.length; j++){
                dp[i] += dp[i + j];
            }
        }

        return dp[0];
    }
}

