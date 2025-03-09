class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num = a;
        
        for(int i=0;i<included.length;i++){
            
            num = (i==0) ? a : num+d;
            
            if (included[i] == true) {
                answer += num;
            }
        }
        
        return answer;
    }
}