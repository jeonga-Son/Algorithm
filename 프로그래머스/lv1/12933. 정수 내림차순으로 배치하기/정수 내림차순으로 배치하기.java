import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = n + "";
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr);
        
        StringBuilder value = new StringBuilder(new String(arr));
        
        answer = Long.valueOf(value.reverse().toString());
        return answer;
    }
}