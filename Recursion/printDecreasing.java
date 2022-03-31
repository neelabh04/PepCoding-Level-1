
// Print Decreasing
public class printDecreasing{
    public void solution(int val){
        if(val == 0){
            return;
        }
        System.out.println(val);
        solution(val - 1);
    }
}
