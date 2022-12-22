class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String replace = "";
		replace = my_string.toLowerCase().replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");
		String[] array = replace.split("");

            for(int i = 0; i< array.length; i++) {
                answer += Integer.parseInt(array[i]);
            }

        
        return answer;
    }
}