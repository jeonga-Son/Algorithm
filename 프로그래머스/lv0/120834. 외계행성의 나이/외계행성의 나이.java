class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        String[] arr = str.split("");
        
        for (int i = 0; i < arr.length; i++) {
            answer += ((char)(Integer.parseInt(arr[i]) + 97));
        }
        
        return answer;
    }
}