class Solution {
    public int solution(int n) {
        int answer = 0;
         
        for (int i = 1; i <= 10; i++) {
            if (fac(i) <= n) {
                answer = i;
            }
        }
        return answer;
    }
    
    int fac(int n) {
        if (n <= 1) {
            return  1;
        } 
        else {
            return n * fac(n - 1);
        }
    }
}