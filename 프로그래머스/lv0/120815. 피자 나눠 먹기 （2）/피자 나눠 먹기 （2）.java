class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 6;
        int index = 1;
        
        while(num % n != 0) {
            index++;
            num = 6 * index;
        }
        
        answer = index;
        return answer;
    }
}