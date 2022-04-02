// Display Array using Recursion

public class displayArray {
    public static void displayArr(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);
    }
}
