class Solution {
    public int solution(int n) {
        int answer = 0;
        Double result = Math.sqrt(n);
        
        if (result == result.intValue()) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}