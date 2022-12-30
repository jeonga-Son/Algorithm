class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        
        for(int i = 0; i < array.length; i++) {
            str += Integer.toString(array[i]);
        }
        
        String[] digits = str.split("");
        
        for(int i = 0; i < digits.length; i++) {
            if (digits[i].equals("7")) {
                answer++;
            }
        }
        
        return answer;
    }
}