class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] arr = str.split("");
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            answer[arr.length - 1 - i] = Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}