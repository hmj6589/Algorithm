class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int num=0;num<queries.length;num++){
            int s = queries[num][0];
            int e = queries[num][1];
            
            for (int i=s;i<=e;i++){
                arr[i] += 1;
            }
        }
        
        return arr;
    }
}