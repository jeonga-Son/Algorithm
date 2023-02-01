import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Map<String, String> hm = new HashMap<>();
        
        hm.put("zero", "0");
        hm.put("one", "1");
        hm.put("two", "2");
        hm.put("three", "3");
        hm.put("four", "4");
        hm.put("five", "5");
        hm.put("six", "6");
        hm.put("seven", "7");
        hm.put("eight", "8");
        hm.put("nine", "9");
        
        Set<String> keySet = hm.keySet();
        
        for (String key : keySet) {
            // System.out.println(key + " : " + hm.get(key));
            if(s.contains(key)) {
                s = s.replace(key, hm.get(key));
            }
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}