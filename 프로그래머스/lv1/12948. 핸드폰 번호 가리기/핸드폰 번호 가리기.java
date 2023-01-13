class Solution {
    public String solution(String phone_number) {
        String digits1 = phone_number.substring(0, phone_number.length() - 4).replaceAll("[0-9]", "*");
        String digits2 = phone_number.substring(phone_number.length() - 4);
        String answer = digits1 + digits2;
        
        return answer;
    }
}