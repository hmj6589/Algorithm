import java.util.*;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        ArrayList<String> string = new ArrayList<>();
        
        for(int i=0;i<my_strings.length;i++){
            int s = parts[i][0];
            int e = parts[i][1];
            
            string.add(my_strings[i].substring(s,e+1));            
        }
        
        return String.join("", string);
    }
}