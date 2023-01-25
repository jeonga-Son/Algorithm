class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int left = 0;
        int right = 0;
        int[][] copy = new int[sizes.length][2];
        int max1 = 0;
        int max2 = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            left = Math.min(sizes[i][0], sizes[i][1]);
            right = Math.max(sizes[i][0], sizes[i][1]);
            
            copy[i][0] = left;
            copy[i][1] = right;
        }
        
        for(int i = 0; i < copy.length; i++) {
            if (copy[i][0] > max1) {
                max1 = copy[i][0];
            }
            
            if (copy[i][1] > max2) {
                max2 = copy[i][1];
            }
        }
        
        answer = max1 * max2;
        
        return answer;
    }
}