import java.io.*;
import java.util.*;
public class findInArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int idx = -1;
        int d = scn.nextInt();
        for(int i = 0; i < n; i++){
            if(arr[i] == d){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}
