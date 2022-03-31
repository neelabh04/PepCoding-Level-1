// Print fibonacci

public class printFibonacci {
    // using recursion
    public int fibRecur(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int fib1 = fibRecur(n - 1);
        int fib2 = fibRecur(n - 2);
        int ans = fib1 + fib2;
        return ans;

    }
    // using memoization 
    public int fibMem(int n, int[] dp){
        if(n == 0 || n == 1){
            return n;
        }

        if(dp[n] != 0){
            return dp[n];
        }

        int fib1 = fibMem(n - 1, dp);
        int fib2 = fibMem(n - 2, dp);
        int ans = fib1 + fib2;
        dp[n] = ans;
        return ans;

    }
    // using tabulation method
    public int fibTab(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i < dp.length; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[dp.length - 1];
    }
}
