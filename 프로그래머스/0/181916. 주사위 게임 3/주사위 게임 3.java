import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] list = {a,b,c,d};
        
        Map<Integer, Integer> numCount = new HashMap<>();
        
        for (int num:list){
            numCount.put(num, numCount.getOrDefault(num,0)+1);
        }
        
        List<Integer> keys = new ArrayList<>(numCount.keySet());
        List<Integer> values = new ArrayList<>(numCount.values());
        
        if(numCount.size()==1){
            
            return 1111*list[0];
        } else if(numCount.size()==3){
            
            int q = keys.get(0);
            int r = keys.get(1);
            
            if(keys.get(0)==keys.get(values.indexOf(2))){
                q = keys.get(1);
                r = keys.get(2);
            } else if (keys.get(1) == keys.get(values.indexOf(2))){
                q = keys.get(0);
                r = keys.get(2);
            }
            
            return q*r;
        } else if(numCount.size()==2){
            if(values.get(0) == 3 || values.get(1) == 3){
                int p = keys.get(values.indexOf(3));
                int q = keys.get(values.indexOf(1));
                
                return (10*p+q)*(10*p+q);
            } else if(values.get(0)==2 || values.get(1) == 2) {
                int p = keys.get(0);
                int q = keys.get(1);
                
                return (p+q)*Math.abs(p-q);
            }
        } 
            Arrays.sort(list);
            return list[0];
        
    }
}