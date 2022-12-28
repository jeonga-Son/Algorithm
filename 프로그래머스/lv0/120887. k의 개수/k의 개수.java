class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int l = i; l <= j; l++) {
            StringBuilder sb = new StringBuilder();
            
            sb.append(l);
            
            for (int m = 0; m < sb.length(); m++) {
                if ((sb.charAt(m) - '0') == k) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}