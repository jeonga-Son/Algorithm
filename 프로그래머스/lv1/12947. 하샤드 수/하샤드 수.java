class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = x + "";
        String[] arr = str.split("");
        int value = 0;
        
        for(int i = 0; i < arr.length; i++) {
            value += Integer.parseInt(arr[i]);
        }
        
        if (x % value != 0) {
            answer = false;
        }
        
        return answer;
    }
}