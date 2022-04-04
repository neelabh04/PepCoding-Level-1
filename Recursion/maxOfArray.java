public class maxOfArray {
    public int max(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int currMax = max(arr, idx + 1);
        if(arr[idx] > currMax){
            currMax = arr[idx];
        }
        return currMax;
    }
}