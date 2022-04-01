//  Calculating power linearly

public class powerLinear {
    public int power(int x, int n){
        if(n == 0){
            return 1;
        }
       int temp = power(x, n - 1);
       int ans = temp * x;
       return ans;
    }
}
