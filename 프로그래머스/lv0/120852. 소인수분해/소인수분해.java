import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int num = 2;
        
        while (n >= 2) {
            if (n % num == 0) {
                list.add(num);
                n /= num;
            } else {
                num++;
            }
        }
        
        answer = list.stream().distinct().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}