import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] value = new int[arr.length];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                value[index] = arr[i];
                index++;
            }
        }
        
        int[] answer = {};
        
        if (index > 0) {
            answer = new int[index];
        } else {
            answer = new int[1];
        }
        
        if (index == 0) {
            answer[0] = -1;
        } else {
            for (int i = 0; i < index; i++) {
                answer[i] = value[i];
            }
        }
    
        Arrays.sort(answer);
        
        return answer;
    }
}