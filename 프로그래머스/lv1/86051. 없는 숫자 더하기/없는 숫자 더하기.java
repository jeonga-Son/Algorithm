class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int cnt = 0;
        int[] allNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for (int i = 0; i < allNumbers.length; i++) {
            cnt = 0;
            
            for (int j = 0; j < numbers.length; j++) {
                if (allNumbers[i] == numbers[j]) {
                    cnt++;
                }
            }
            
            if (cnt == 0) {
                answer += allNumbers[i];
            }
        }
        
        return answer;
    }
}