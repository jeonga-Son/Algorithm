class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr = s.split("");
        int pCnt = 0;
        int yCnt = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("p") || arr[i].equals("P")) {
                pCnt++;
            }
            
            if (arr[i].equals("y") || arr[i].equals("Y")) {
                yCnt++;
            }
        }
        
        if (pCnt == yCnt) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}