class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        long value = Long.parseLong(bin1, 2) + Long.parseLong(bin2, 2);
        
        answer = Long.toBinaryString(value);
        return answer;
    }
}