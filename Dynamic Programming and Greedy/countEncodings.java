public class countEncodings {
    public static int solution(String str) {
        int n = str.length();
        int dp[] = new int[n];
        dp[0] = 1;
        if (str.charAt(0) == '0'){
            return 0;
        }
        for (int i = 1; i < n; i++) {
            if (str.charAt(i - 1) == '0' && str.charAt(i) == '0') {
                dp[i] = 0;
            } else if (str.charAt(i - 1) == '0' && str.charAt(i) != '0') {
                dp[i] = dp[i - 1];
            } else if (str.charAt(i - 1) != '0' && str.charAt(i) == '0') {
                if (str.charAt(i - 1) == '1' || str.charAt(i - 1) == '2')
                    dp[i] = (i >= 2 ? dp[i - 2] : 1);
                else {
                    dp[i] = 0;
                }
            } else {
                if (Integer.parseInt(str.substring(i - 1, i + 1)) <= 26) {
                    dp[i] = dp[i - 1] + (i >= 2 ? dp[i - 2] : 1);
                } else {
                    dp[i] = dp[i - 1];
                }
            }
        }
        return dp[str.length() - 1];
    }
}