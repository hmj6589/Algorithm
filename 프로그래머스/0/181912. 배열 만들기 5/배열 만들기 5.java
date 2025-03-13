import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> ret = new ArrayList<>();
        
        for(int i=0;i<intStrs.length;i++){
            int a = Integer.parseInt(intStrs[i].substring(s,s+l));
            
            if(a>k){
                ret.add(a);
            }
        }
        
        int[] answer = new int[ret.size()];
        for(int i=0;i<ret.size();i++){
            answer[i]=ret.get(i);
        }
        
        
        return answer;
    }
}