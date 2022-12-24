class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        
        for (int i = 0; i < t; i++) {
            answer = (int) (n * Math.pow(2, t));
        }
        
        return answer;
    }
}