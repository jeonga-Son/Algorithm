import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            int abs = Math.abs(array[i] - n);
            
            if (min > abs) {
                min = abs;
                answer = array[i];
            }
        }
        
        return answer;
    }
}