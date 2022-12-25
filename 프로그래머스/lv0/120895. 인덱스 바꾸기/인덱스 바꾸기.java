import java.util.Arrays;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] str = my_string.split("");
        String temp = "";
        
        temp = str[num1];
        str[num1] = str[num2];
        str[num2] = temp;
        
        answer = String.join("", str);
        
        return answer;
    }
}