import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        String[] copy = s.split("");
        
        Arrays.sort(str);
        Arrays.sort(copy);
        
        for (int i = 0; i < str.length; i++) {
            int cnt = 1;
            
            for (int j = 0; j < copy.length; j++) {
                if (str[i].equals(copy[j]) && i != j) {
                    cnt++;
                }
            }
            
            if (cnt == 1) {
                answer += str[i];
            }
        }
        
        return answer;
    }
}