import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] lists = String.valueOf(n).split("");
        
        Arrays.sort(lists);
        
        StringBuilder sb = new StringBuilder();
        
        for (String list : lists) sb.append(list);
    
        return Long.parseLong(sb.reverse().toString());
    }
}