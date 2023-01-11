class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int value = 0;
        
        for (int i = 0; i < arr.length; i++) {
            value += arr[i];
        }
        
        answer = (double) value / arr.length;
        
        return answer;
    }
}