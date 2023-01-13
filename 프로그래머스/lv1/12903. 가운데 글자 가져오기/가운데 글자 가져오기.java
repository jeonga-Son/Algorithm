class Solution {
    public String solution(String s) {
        String answer = "";
        String[] digits = s.split("");
        int length = s.length();
        
        if (length % 2 == 0) {
            answer = digits[(length / 2) - 1] + digits[length / 2];
        } else {
            answer = digits[length / 2];
        }
        
        return answer;
    }
}