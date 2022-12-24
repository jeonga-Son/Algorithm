class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n + 1];
        int index = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[index] = i;
                index++;
            }
        }

        int[] temp = new int[index];
        
        for(int i = 0; i < index; i++) {
            temp[i] = answer[i];
        }
        
        answer = temp;
        
        return answer;
    }
}