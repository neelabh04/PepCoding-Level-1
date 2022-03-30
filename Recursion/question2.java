package Recursion;

// Print Increasing

public class question2 {
    public void printIncreasing(int val){
        if(val == 0){
            return;
        }
        printIncreasing(val - 1);
        System.out.println(val);
    }
}
