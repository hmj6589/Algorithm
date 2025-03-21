import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<num_list.length;i++){
            result.add(num_list[i]);
        }
        
        result = new ArrayList<>(result.subList(n-1, result.size()));
        
        return result.stream().mapToInt(i->i).toArray();
    }
}