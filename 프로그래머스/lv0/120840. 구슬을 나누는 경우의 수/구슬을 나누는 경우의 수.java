class Solution {
    public int combination(int n, int m) {
        if (m == 0 || n == m) {
            return 1;
        } else {
            return combination(n - 1, m - 1) + combination(n - 1, m);
        }
    }
    public int solution(int balls, int share) {
        int answer = 0;
        
        answer = combination(balls, share);
        
        return answer;
    }
}