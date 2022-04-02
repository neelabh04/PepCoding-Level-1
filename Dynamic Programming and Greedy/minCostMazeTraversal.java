// Minimum cost of traversal in a 2D Matrix

public class minCostMazeTraversal {
    public int minCost(int[][] arr){
        int[][] dp = new int[arr.length][arr[0].length];

        for(int i = dp.length - 1; i >= 0; i--){
            for(int j = dp[0].length - 1; j >= 0; j--){

                // this is the ending point so this cost we will have to bear
                if(i == dp.length - 1 && j == dp[0].length - 1){
                    dp[i][j] = arr[i][j];
                }
                
                // last row and last column will have the same value as the original maze because we can only travel in the same portion
                // as we can move either down or right 
                else if(i == dp.length  - 1){
                    dp[i][j] = dp[i][j + 1] + arr[i][j];
                }else if(j == dp[0].length - 1){
                    dp[i][j] = dp[i + 1][j] + arr[i][j];
                }
                
                // for the rest of the dp 
                else{
                    dp[i][j] = Math.min(dp[i][j + 1], dp[i + 1][j]) + arr[i][j];
                }
            }
        }

        return dp[0][0];
    }    
}
