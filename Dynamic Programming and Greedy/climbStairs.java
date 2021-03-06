// Climb Stairs

public class climbStairs {
    public int climbStairsTab(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            if(i == 1){
                dp[i] = dp[i - 1];
            }else if(i == 2){
                dp[i] = dp[i - 1] + dp[i - 2];
            }else{
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }
}
