class Solution {
    final int service = 10;
    
    public int solution(int chicken) {
        int answer = 0;
        
        while (chicken >= service) {
            int newChicken = chicken / service;
            int restCoupon = chicken % service;
            chicken = newChicken + restCoupon;
            
            answer += newChicken;
        }
        return answer;
    }
}