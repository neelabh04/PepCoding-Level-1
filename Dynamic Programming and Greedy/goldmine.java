// Goldmine -> Can start anywhere from the first column, return the max cost

public class goldmine {
    public static int maxCost(int[][] grid){
        int[][] dp = new int[grid.length][grid[0].length];
        
        int maxGold = Integer.MIN_VALUE;
        
        for(int j = dp[0].length - 1; j >= 0; j--){
            for(int i = dp.length - 1; i >= 0; i--){

                // last column takes the value of the original grid
                if(j == dp[0].length - 1){
                    dp[i][j] = grid[i][j];
                }

                // in first row we can check in the (same row and next column) and (next row and next column)
                else if(i == 0){
                    dp[i][j] = grid[i][j] + Math.max(dp[i][j+1],dp[i+1][j+1]);
                }

                // in last row we can check in the (same row and next column) and (previous row and next column)
                else if(i == dp.length - 1){
                    dp[i][j] = grid[i][j] + Math.max(dp[i-1][j+1],dp[i][j+1]);
                }

                // remaining grid we can check (same row and next column) and (previous row and next column) and (next row and next column)  
                else{
                    dp[i][j] = Math.max(dp[i + 1][j + 1], Math.max(dp[i - 1][j + 1], dp[i][j + 1])) + grid[i][j];
                }
                
                
                if(dp[i][j] > maxGold){
                    maxGold = dp[i][j];
                }
            }
        }
        
        return maxGold;
    }
}
