package Arrays;

// Digit Frequency

public class question1 {
    public int getDigitFrequency(int n, int d){
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
