import java.io.*;
import java.util.*;
public class spanOfArray {
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = Math.max(arr[i], max);
            }
            if(arr[i] < min){
                min = Math.min(arr[i], min);
            }
        }
        
        int ans = max - min;
        System.out.println(ans);
    }
}
