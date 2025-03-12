import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i=0;i<index_list.length;i++){
            answer.add(my_string.substring(index_list[i],index_list[i]+1));
        }
        
        return String.join("", answer);
    }
}