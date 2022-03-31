// Print Factorial of a Number

public class printFactorial {
    public int solution (int n){
        if(n == 0){
            return 1;
        }

        int ans = n * factorial(n - 1);
        return ans;
    }
}
