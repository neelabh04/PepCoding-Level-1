public class firstAndLastIndex {
    public static int[] solution(int[] arr, int data) {
        int lastIndex = -1;
        int firstIndex = -1;
        int lo = 0;
        int hi = n - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < data) {
                lo = mid + 1;
            } else if (arr[mid] > data) {
                hi = mid - 1;
            } else {
                firstIndex = mid;
                hi = mid - 1;
            }
        }

        lo = 0;
        hi = n - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < data) {
                lo = mid + 1;
            } else if (arr[mid] > data) {
                hi = mid - 1;
            } else {
                lastIndex = mid;
                lo = mid + 1;
            }
        }

        int[] res = new int[2];
        res[0] = firstIndex;
        res[1] = lastIndex;

        return res;
    }
}
