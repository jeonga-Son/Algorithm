class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        if (hp % 5 == 4) {
            answer = (hp / 5) + 2;
        } 
        
        else if (hp % 5 == 3) {
            answer = (hp / 5) + 1;
        } 
        
        else if (hp % 5 == 2) {
            answer = (hp / 5) + 2;
        } 
        
        else if (hp % 5 == 1) {
            answer = (hp / 5) + 1;
        } 
        
        else {
            answer = hp / 5;
        }
        
        return answer;
    }
}