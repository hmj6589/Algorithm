class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int a = 1;
        
        for(int i=0;i<num_list.length;i++){
            sum += num_list[i];
            a = a*num_list[i];
        }
        
        // System.out.println(a+","+sum*sum);
        
        return (a<(sum*sum)) ? 1 : 0;
    }
}