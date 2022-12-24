class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int temp = 1;
        
        for (int i = 0; i < box.length - 1; i++) {
            if (box[i] == n) {
                answer = box[0] / n;
            } else {
                temp *= box[i] / n;
            }
        }
        
        answer = temp * (box[2] / n);
        return answer;
    }
}