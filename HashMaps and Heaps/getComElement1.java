// Get Common Elements - 1
public class getComElement1 {
    public static void solution(int[] a1, int[] a2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a1.length; i++) {
            map.put(a1[i], map.getOrDefault(a1[i], 1) + 1);
        }

        for (int j = 0; j < a2.length; j++) {
            if (map.containsKey(a2[j]) == true) {
                System.out.println(a2[j]);
                map1.remove(a2[j]);
            }
        }

        // or

        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int val : a1) {
            if (map2.containsKey(val) == false) {
                map2.put(val, 1);
            } else {
                int frq = map2.get(val);
                int maxfrq = frq + 1;
                map2.put(val, maxfrq);
            }
        }

        for (int val : a2) {
            if (map2.containsKey(val)) {
                System.out.println(val);
                map2.remove(val);
            }
        }

    }
}
