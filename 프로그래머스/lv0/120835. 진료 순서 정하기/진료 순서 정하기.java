import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        int[] copy = new int[emergency.length];
        
        for (int i = 0; i < copy.length; i++) {
            copy[i] = emergency[i];
        }
        
        
        Arrays.sort(copy);
        
        for (int i = 0; i < copy.length; i++) {
            int num = copy.length - i;
            hashMap.put(copy[i], num);
        }
        
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = hashMap.get(emergency[i]);
        }
        
        return answer;
    }
}