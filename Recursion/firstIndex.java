public class firstIndex {
    public int firstOccur(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }else{
            int remainArray = firstOccur(arr, idx + 1, x);
            return remainArray;
        }
    }
}
