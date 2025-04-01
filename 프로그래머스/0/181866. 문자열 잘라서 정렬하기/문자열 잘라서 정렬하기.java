import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> result = new ArrayList<>();
        for(String i:answer){
            if(!i.isEmpty()) result.add(i);
        }
        
        Collections.sort(result);
        
        return result.toArray(new String[0]);
    }
}