import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String str = my_string.toLowerCase();
        
        String[] digits = str.split("");
        
        Arrays.sort(digits);
        
        for (int i = 0; i < digits.length; i++) {
            answer += digits[i];
        }
        
        return answer;
    }
}