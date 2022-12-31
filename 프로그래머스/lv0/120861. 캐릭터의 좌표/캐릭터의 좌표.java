class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int count = 0;
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                answer[0] -= 1;
                
                if (answer[0] < -(board[0] / 2)) {
                    answer[0] = -(board[0] / 2);
                }
            } 
            
            if (keyinput[i].equals("right")) {
                answer[0] += 1;
                
                if (answer[0] > board[0] / 2) {
                    answer[0] = board[0] / 2;
                }
            } 
            
            if (keyinput[i].equals("up")) {
                answer[1] += 1;
                
                if (answer[1] > board[1] / 2) {
                    answer[1] = board[1] / 2;
                }
            } 
            
            if (keyinput[i].equals("down")) {
                answer[1] -= 1;
                
                if (answer[1] < -(board[1]) / 2) {
                    answer[1] = -(board[1] / 2);
                }
            }
        }
        return answer;
    }
}