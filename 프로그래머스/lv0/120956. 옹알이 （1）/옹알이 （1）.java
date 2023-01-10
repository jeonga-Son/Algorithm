class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            String a = babbling[i];
            
            a = a.replace("aya", "1");
            a = a.replace("ye", "2");
            a = a.replace("woo", "3");
            a = a.replace("ma", "4");
            
            // 치환되지 않은 알파벳이 남아있을 경우와
            // 같은 발음이 연속되었을 경우 제외하고
            // 나머지 경우에만 발음이 가능함.
            if (a.matches(".*[a-zA-Z].*")) {
            } else if (a.contains("11") || a.contains("22") || a.contains("33") || a.contains("44")) {
            } else {
                answer++;
            }
        }
        
        return answer;
    }
}