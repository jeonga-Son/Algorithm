class Solution {
    public int solution(int n) {
        int answer = n;
        
        for (int i = n; i >= 2; i--) {
            if(n % i == 1) {
                answer = i;
            }
        }
        
        return answer;
    }
}