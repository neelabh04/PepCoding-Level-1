public class lastIndex {
    public int lastOccur(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int currLast = lastOccur(arr, idx + 1, x);
        if(currLast == -1){
            if(arr[idx] == x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return currLast;
        }
    }
}
