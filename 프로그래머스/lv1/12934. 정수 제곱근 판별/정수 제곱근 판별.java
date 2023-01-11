class Solution {
    public long solution(long n) {
        long answer = -1;
        long sqrt = (long)Math.sqrt(n);
        
        if (sqrt * sqrt == n) {
            answer = (long)Math.pow(sqrt + 1, 2);
        }
        
        return answer;
    }
}