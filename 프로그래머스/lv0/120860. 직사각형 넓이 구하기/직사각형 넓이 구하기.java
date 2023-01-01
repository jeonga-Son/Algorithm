import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int height = 0;
        
        // answer = Math.abs(dots[0][0] - dots[1][0]) * Math.abs(dots[1][1] - dots[2][1]);
        
        for(int i = 1; i < dots.length; i++) {
            if (dots[i - 1][0] != dots[i][0]) {
                width = Math.abs(dots[i - 1][0] - dots[i][0]);
            } 

            if (dots[i - 1][1] != dots[i][1] ){
                height = Math.abs(dots[i - 1][1] - dots[i][1]);
            }
        }
        
        answer = width * height;
        
        return answer;
    }
}