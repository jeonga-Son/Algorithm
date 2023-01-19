class Solution {
    public int solution(int n) {
        String str = Integer.toString(n, 3);
        String reverse = "";
        
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i) + "";
        }
        
        
        int answer = Integer.parseInt(reverse, 3);
        
        return answer;
    }
}