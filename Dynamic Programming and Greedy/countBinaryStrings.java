public class countBinaryStrings {
    // using dp
    public static int solution(int n){
        int[] dp0 = new int[n + 1];
        int[] dp1 = new int[n + 1];

        dp0[1] = 1;
        dp1[1] = 1;
        for(int i = 2; i <= n; i++){
            dp1[i] = dp0[i - 1] + dp1[i - 1];
            dp0[i] = dp1[i - 1]; 
        }

        int ans = dp0[n] + dp1[n];
        return ans;
    }

    // using only variables
    public static int solution2(int n){
        int ans = 0;
        int old_zeros = 1;
        int old_ones = 1;
        for(int i = 2; i <= n; i++){
            int new_ones = old_zeros + old_ones;
            int new_zeros = old_ones;

            old_ones = new_ones;
            old_zeros = new_zeros;
        }
        ans = old_ones + old_zeros;
        return ans;
    }
}