public class selectionSort {
    
    public static void selection(int[] arr){
        // outer loop is for total number of iterations = length of array - 1
        // in first iteration we find the smallest element in the array and swap with the first element present in the array
        // this makes sure that the smallest element is at the beginning of the sorted array
        for(int i = 1; i <= arr.length; i++){
            int min = i;
            for(int j = 0; j < arr.length; j++){

                if(isSmaller(arr, j, min)){
                    min = j; 
                }
            }
            swap(arr, arr[j], arr[i]);
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
