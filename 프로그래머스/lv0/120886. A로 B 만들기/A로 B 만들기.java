import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeCh = before.toCharArray();
        char[] afterCh = after.toCharArray();
        
        Arrays.sort(beforeCh);
        Arrays.sort(afterCh);
        
        String beforeStr = new String(beforeCh);
        String afterStr = new String(afterCh);
        
        if (beforeStr.equals(afterStr)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}