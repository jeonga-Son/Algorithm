class Solution {
    
    public int solution(int a, int b) {
        int answer = 0;
        int newB = b / gcd(a, b);
        
        while (newB != 1) {
            if (newB % 2 == 0) {
                newB /= 2;
            } else if (newB % 5 == 0) {
                newB /= 5;
            } else {
                return 2;
            }
        }
        
        return 1;
    }
    
    private int gcd(int a, int b) {
        int max = 0;
    
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        
        return max;
    }
}