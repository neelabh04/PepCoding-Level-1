// Print Decreasing Increasing
public class printDecInc {
    public void solution (int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        solution(n - 1);
        System.out.println(n);
    }
}
