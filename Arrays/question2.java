package Arrays;

// Decimal to any base

public class question2 {
    public int getValueInBase(int n, int b){
        int ans = 0;
        int power = 1;
        while(n != 0){
            int val = n % b;
            n = n / b;
            ans += val * power;
            power = power * 10;
        }
        return ans;
    }
}
