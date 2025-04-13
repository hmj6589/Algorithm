import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        for(int num : arr){
            if(!set.contains(num)){
                set.add(num);
                list.add(num);
                if(list.size() == k) break;
            }
        }
        
        while(list.size() < k){
            list.add(-1);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}