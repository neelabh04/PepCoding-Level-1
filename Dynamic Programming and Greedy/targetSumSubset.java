public class targetSumSubset {
    public static boolean targetSumSubsets(int[] arr, int tar) {

        boolean[][] dp = new boolean[arr.length + 1][tar + 1];
        int rowLength = arr.length + 1;
        int colLength = tar + 1;

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {

                // empty subset zero run bana sakta hai 
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } 

                // empty subset zero ke alwa kuch run nahi bana sakta
                else if (i == 0) {
                    dp[i][j] = false;
                } 

                // batsman batting nahi kare toh zero run bana sakta hai 
                else if (j == 0) {
                    dp[i][j] = true;
                } 
                
                // Batsman ke batting karne ke option
                else {

                    // Me batting nahi karta, toh kya tum log current run bana sakte ho
                    if (dp[i - 1][j] == true) {
                        dp[i][j] = true;
                    }

                    // Me batting karta hunn, toh kya tum log current run bana sakte ho
                    else {

                        // Me itna score kar sakta hunn
                        int myBattingValue = arr[i - 1];

                        // Merko batting dene ke liye current score mujhse zayda hona chaiyeh
                        if (j >= myBattingValue) {

                            // Mere batting karne ke baad jo score bacha kya tum woh bana sakte ho
                            if (dp[i - 1][j - myBattingValue] == true) {
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }

        // kya hum sub mil ke itna score bana sakte hai
        return dp[rowLength - 1][colLength - 1];
    }
}
