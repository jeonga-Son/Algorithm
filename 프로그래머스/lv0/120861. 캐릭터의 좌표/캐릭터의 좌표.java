class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int count = 0;
        int leftLimit = -(board[0] / 2);
        int rightLimit = board[0] / 2;
        int upLimit = board[1] / 2;
        int downLimit = -(board[1] / 2);
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                answer[0] -= 1;
                
                if (answer[0] < leftLimit) {
                    answer[0] = leftLimit;
                }
            } 
            
            if (keyinput[i].equals("right")) {
                answer[0] += 1;
                
                if (answer[0] > rightLimit) {
                    answer[0] = rightLimit;
                }
            } 
            
            if (keyinput[i].equals("up")) {
                answer[1] += 1;
                
                if (answer[1] > upLimit) {
                    answer[1] = upLimit;
                }
            } 
            
            if (keyinput[i].equals("down")) {
                answer[1] -= 1;
                
                if (answer[1] < downLimit) {
                    answer[1] = downLimit;
                }
            }
        }
        return answer;
    }
}