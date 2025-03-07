class Solution {
    public int solution(int a, int b) {
        String num = Integer.toString(a) + Integer.toString(b);
        
        if (Integer.parseInt(num) < 2*a*b){
            return 2*a*b;
        } else {
            return Integer.parseInt(num);
        }
    }
}