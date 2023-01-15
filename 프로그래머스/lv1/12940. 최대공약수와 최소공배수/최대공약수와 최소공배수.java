class Solution {
    // 최대공약수
    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        
        return gcd(b, a % b);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        answer[0] = gcd(max, min);
        
        // 최소 공배수 = 두 수의 곱 / 최대공약수
       answer[1] = max * min / answer[0]; 
        
        return answer;
    }
}