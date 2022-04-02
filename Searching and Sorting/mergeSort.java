// Merge sort an array

public class mergeSort {
    public static int[] mergeSort(int[] arr, int lo, int hi) {

        if (lo == hi) {
            int[] base = new int[1];
            base[0] = arr[lo];
            return base;
        }
        int mid = (lo + hi) / 2;

        int[] firstSortHalf = mergeSort(arr, lo, mid);
        int[] secondSortHalf = mergeSort(arr, mid + 1, hi);
        int[] answer = mergeTwoSortedArrays(firstSortHalf, secondSortHalf);

        return answer;
    }

    // used for merging two sorted arrays
    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            } else {
                ans[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < a.length) {
            ans[k] = a[i];
            k++;
            i++;
        }

        while (j < b.length) {
            ans[k] = b[j];
            k++;
            j++;
        }

        return ans;
    }
}