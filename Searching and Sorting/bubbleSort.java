public class bubbleSort {
    public static void bubbling(int[] arr) {
        // outer loop is for total number of iterations = length of array - 1
        for (int i = 1; i <= arr.length - 1; i++) {

            // yaha pe jitni iterations ho chuki hongi utne bande sort ho chuke honge
            for (int j = 0; j < arr.length - i; j++){

                // har koi apne peeche waale se compare hota hai 
                if (isSmaller(arr, j + 1, j)) {

                    // aisa karne se sabse biggest element apni sahi index pe aajata hai i.e at its last position in the sorted array
                    swap(arr, j + 1, j);

                }
            }
        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // return true if ith element is smaller than jth element
    public static boolean isSmaller(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }
}
