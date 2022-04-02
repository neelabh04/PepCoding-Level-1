// Tower of Hanoi

public class towerOfHanoi {
    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n == 1){
            System.out.println(n + "[" + t1id + " -> " + t2id + "]");
            return;
        }
        toh(n - 1, t1id, t3id, t2id);
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
        toh(n - 1, t3id, t2id, t1id);
    }

}
