class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String num1 = Integer.toString(a) + Integer.toString(b);
        String num2 = Integer.toString(b) + Integer.toString(a);
        
        if(Integer.parseInt(num1) < Integer.parseInt(num2) || Integer.parseInt(num1) == Integer.parseInt(num2)){
            answer = Integer.parseInt(num2);
        } else {
            answer = Integer.parseInt(num1);
        }
        
        return answer;
    }
}