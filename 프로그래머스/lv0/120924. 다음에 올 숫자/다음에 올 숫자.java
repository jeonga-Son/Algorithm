class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int[] num = new int[common.length - 1];
        
        for (int i = 1; i < common.length; i++) {
            num[i - 1] = common[i] - common[i - 1];
        }
        
        if (num[0] == num[1]) {
            answer = common[common.length - 1] + num[0];
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        
        return answer;
    }
}