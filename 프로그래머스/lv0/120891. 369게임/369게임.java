import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int order) {
        int answer = 0;
        int[] digits = Stream.of(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();
        
        for(int i = 0; i < digits.length; i++) {
            if(digits[i] % 3 == 0 && digits[i] != 0) {
                answer++;
            } 
        }
        
        return answer;
    }
}