class Solution {
    public int[] solution(String my_string) {
        int [] answer = new int[52];
        
        for(int i=0;i<my_string.length();i++){
            if((int) my_string.charAt(i) >= 97){
                answer[(int) my_string.charAt(i) - 71]++;
            } else {
                answer[(int) my_string.charAt(i) - 65]++;
            }
        }
        
        return answer;
    }
}