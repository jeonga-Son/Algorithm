import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        List<Double> slopes = new ArrayList<>();
        
        // 점간의 거리가 겹치면 안되기 때문에 
        // 외부 반복무은 마지막 index 전까지
        // 내부 반복문은 외부 요소보다 한 index 높은 요소부터 검사
        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double x = dots[i][0] - dots[j][0];
                double y = dots[i][1] - dots[j][1];
                
                // 기울기 = y 증가량 값 / x 증가량 값
                double slope = y / x;
                
                if (!slopes.contains(slope)) {
                    slopes.add(slope);
                } else {
                    answer = 1;
                    break;
                }
            }
            
            if (answer == 1) {
                break;
            }
        }
        
        return answer;
    }
}