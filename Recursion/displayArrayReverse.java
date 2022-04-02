// Display an array in reverse using recursion

public class displayArrayReverse {

    //  if last index is passed
    public static void displayArr(int[] arr, int idx){
        if(idx == 0){
            System.out.println(arr[idx]);
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx - 1);
    }

    // if starting index is passed
    public static void displayArr1(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        displayArr1(arr, idx + 1);
        System.out.println(arr[idx]);
    }

}
