class Solution {
    public int solution(int[] num_list) {
        int n;
        
        if(num_list.length >= 11){
            n=0;
            for(int i:num_list){
                n+=i;
            }
        }else{
            n=1;
            for(int i:num_list){
                n*=i;
            }
        }
        
        return n;
    }
}