class Solution {
    public int[] solution(int[] arr, int[][] queries) {        
        for(int num=0;num<queries.length;num++){
            int s = queries[num][0];
            int e = queries[num][1];
            int k = queries[num][2];
            
            for(int i=s;i<=e;i++){
                if(i%k==0) arr[i]+=1;
            }
            
        }
        
        return arr;
    }
}