// Any base to Any base

public class anybaseToAnybase {
    public int solution(int value, int sourceBase, int destBase) {
        int valueInDecimal = anybaseToDecimal(value, sourceBase);
        int ans = decimalToAnyBase(valueInDecimal, destBase);
        return ans;
    }

    public int decimalToAnyBase(int n, int b) {
        
        int ans = 0;
        int power = 1;

        while (n != 0) {
            int val = n % b;
            n = n / b;
            ans += val * power;
            power = power * 10;
        }
        
        return ans;
    }

    public int anybaseToDecimal(int value, int base) {

        int ans = 0;
        int power = 1;

        while (value > 0) {
            int digit = value % 10;
            value = value / 10;
            ans += digit * power;
            power = power * base;
        }

        return ans;
    }
}
