// Get Common Elements - 2
public class getComElement2 {
    public static void solution(int[] array1, int[] array2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < array1.length; j++) {
            int val = array1[j];

            if (map.containsKey(val) == false) {
                map.put(val, 1);
            } else {
                int frq = map.get(val);
                int newfrq = frq + 1;
                map.put(val, newfrq);
            }
        }

        for (int value : array2) {
            if (map.containsKey(value) == true && map.get(value) > 0) {
                System.out.println(value);
                int frq1 = map.get(value);
                int newfrq1 = frq1 - 1;
                map.put(value, newfrq1);

            }
        }
    }

    // Writing in other way

    public static void solution2(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val1 : arr1) {
            map.put(val1, map.getOrDefault(val1, 0) + 1);
        }

        for (int val2 : arr2) {
            if (map.containsKey(val2)) {
                if (map.get(val2) == 0) {
                    map.remove(val2);
                } else {
                    System.out.println(val2);
                    map.put(val2, map.get(val2) - 1);
                }
            }
        }
    }
}
