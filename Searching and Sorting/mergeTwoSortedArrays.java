// Merger two sorted arrays

public class mergeTwoSortedArrays {
    public int[] solution(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length][arr2.length];
        
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                res[k] = arr1[i];
                i++;
            }else{
                res[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < arr1.length){
            res[k] = arr1[i];
            i++;
            k++;
        }
        
        while(j < arr2.length){
            res[k] = arr2[i];
            j++;
            k++;
        }
        
        return res;
    }    
}
