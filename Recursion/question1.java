package Recursion;

// Print Decreasing

public class question1{
    public void printDecreasing(int val){
        if(val == 0){
            return;
        }
        System.out.println(val);
        printDecreasing(val - 1);
    
    }

}
