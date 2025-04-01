import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> result = new ArrayList<>();
        
        for(int i=0;i<strArr.length;i++){
            String str = strArr[i];
            
            if(! str.contains("ad")){
                result.add(str);
            }
        }
    
        return result.toArray(new String [0]);
    }
}