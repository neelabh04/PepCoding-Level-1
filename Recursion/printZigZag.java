// Print zig zag

public class printZigZag {
    public static void pzz(int n){
        if(n == 0){
            return;
        }
        
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
    }
}
