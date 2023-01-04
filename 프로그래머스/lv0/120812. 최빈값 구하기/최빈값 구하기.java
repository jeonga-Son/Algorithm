class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] cntArr = new int[1001];
        int max = 0;
        int max_index = 0;
        int cnt = 0;
                
        for(int i = 0; i < array.length; i++) {
            cntArr[array[i]]++;
        }

        
        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i] > max) {
                max = cntArr[i];
                max_index = i;
            }
        }
        
        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i] == max) {
                cnt++;
            }
            
            if (cnt > 1) {
                return -1;
            }
        } 
        
        answer = max_index;
        
        return answer;
    }
}