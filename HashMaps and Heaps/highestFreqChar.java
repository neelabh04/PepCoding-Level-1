// Highest Frequency Character in a String

import java.util.HashMap;

public class highestFreqChar {
    public char solution (String str){
        char maxFreq = str.charAt(0);
        
        HashMap<Character, Integer> fmap = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(fmap.containsKey(ch) == false){
                fmap.put(ch, 1);
            }else{
                fmap.put(ch, fmap.get(ch) + 1);
            }
        }

        for(char ch: map.keySet()){
            if(fmap.get(ch) > fmap.get(maxFreq)){
                maxFreq = ch;
            }
        }
        return maxFreq;
    }
}
