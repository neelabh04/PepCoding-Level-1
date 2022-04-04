public class coinChangeCombinations {
    public int solution(int[] arr, int amt) {
        int[] dp = new int[amt + 1];
        dp[0] = 1;

        for (int i = 1; i < dp.length; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] += dp[i - coin];
                }
            }
        }

        return dp[amt];
    }
}
