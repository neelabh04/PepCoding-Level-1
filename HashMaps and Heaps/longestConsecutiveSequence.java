public class longestConsecutiveSequence {
    public void solution(int[] array) {
        HashMap<Integer, Boolean> fmap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            fmap.put(val, true);
        }

        for (int value1 : array) {
            if (fmap.containsKey(value1 - 1) == true) {
                fmap.put(value1, false);
            }
        }

        int maxLen = 0;
        int maxStartPoint = 0;

        for (int value1 : array) {
            if (fmap.get(value1) == true) {
                int tempStartPoint = value1;
                int tempLen = 1;

                while (fmap.containsKey(tempStartPoint + tempLen) == true) {
                    tempLen++;
                }

                if (tempLen > maxLen) {
                    maxLen = tempLen;
                    maxStartPoint = tempStartPoint;
                }
            }
        }

        for (int i = 0; i < maxLen; i++) {
            System.out.println(maxStartPoint + i);
        }
    }
}
