// Calculating power by dividing

public class powerLogarithm {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        
        int temp = power(x, n / 2);
        
        if(n % 2 == 0){
            int ansEven = temp * temp;
            return ansEven;
        }else{
            int ansOdd = temp * temp * x;
            return ansOdd;
        }
    }
}
