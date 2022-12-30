class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        String[] strArr = my_str.split("");
        String str = "";
        int cnt = 2;
        int index = n;
        
        if (my_str.length() % n == 0) {
            answer = new String[my_str.length() / n];
        } else {
            answer = new String[my_str.length() / n + 1];
        }
        
        for (int i = 0; i < answer.length; i++) {
            str = "";
            
            for (int j = i * n; j < index; j++) {
                str += strArr[j];
            }
            
            index = n * cnt;
            cnt++;
            
            answer[i] = str;
            
            
            if (index >= strArr.length) {
                index = strArr.length;
            }
        }
        
        return answer;
    }
}