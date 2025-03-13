import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        ArrayList<String> answer = new ArrayList<>();
        
        answer.add(my_string.substring(my_string.length()-n,my_string.length()));
        
        return String.join("", answer);
    }
}