class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i=0;i<num_list.length;i++){
            
            int n = num_list[i];
            
            while(true){
                if(n%2==0){
                    n=n/2;
                } else if(n==1){
                    break;
                }else {
                    n=(n-1)/2;
                }
                
                answer++;
            }
        }
        
        return answer;
    }
}