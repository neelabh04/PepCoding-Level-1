//  Any base to Decimal

public class anybaseToDecimal {
    public int solution(int value, int base){
        
        int ans = 0;
        int power = 1;

        while(value > 0){

            int digit = value % 10;
            value = value / 10;
            ans += digit * power;
            power = power * base;
            
        }

        return ans;
    }
}
