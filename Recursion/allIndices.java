public class allIndices {
    public  int[] allOccur(int[] arr, int x, int idx, int fsf) {

        if (idx == arr.length) {
            return new int[fsf];
        }
        if (arr[idx] == x) {
            int[] indexArr = allOccur(arr, x, idx + 1, fsf + 1);
            indexArr[fsf] = idx;
            return indexArr;
        } else {
            int[] indexArr = allOccur(arr, x, idx + 1, fsf);
            return indexArr;
        }

    }
}
