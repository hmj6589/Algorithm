import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        int i=0;
        while(i<arr.length){
            if(stk.isEmpty() || stk.get(stk.size()-1)<arr[i]){
                stk.add(arr[i]);
                i++;
            } else {
                stk.remove(stk.size()-1);
            }
        }
        
        int[] result = new int[stk.size()];
        for(int a=0;a<stk.size();a++){
            result[a]=stk.get(a);
        }
        
        return result;
    }
}