import java.util.PriorityQueue;

public class kLargestElements {
    public void solution(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            if(i < k){
                pq.add(arr[i]);
            }else{
                if(arr[i] > pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }

        for(int i = 0; i < k; i++){
            System.out.println(pq.remove());
        }
    }
}