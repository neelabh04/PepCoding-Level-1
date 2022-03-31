// Print Increasing

public class printIncreasing {
    public void solution(int val){
        if(val == 0){
            return;
        }
        solution(val - 1);
        System.out.println(val);
    }
}
