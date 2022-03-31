// Digit Frequency

public class getDigitFrequency {
    public int solution(int n, int d){
        int count = 0;
        int divisor = 10;
        while(n != 0){
            int rem = n % divisor;
            if(rem == d){
                count++;
            }
            n = n / divisor;
        }
        return count;
    }
}
