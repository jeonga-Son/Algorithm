class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        String[] arr = s.split("");
        
        for (String a : arr) {
            idx = a.contains(" ") ? 0 : idx + 1;
            answer += idx % 2 == 0 ? a.toLowerCase() : a.toUpperCase();
        }
        
        return answer;
    }
}