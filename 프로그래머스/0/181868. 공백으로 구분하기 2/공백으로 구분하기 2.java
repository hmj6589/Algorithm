import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] str = my_string.split(" ");
        ArrayList<String> result = new ArrayList<>();
        
        for(int i=0;i<str.length;i++){
            if(! str[i].equals("")){
                result.add(str[i]);
                System.out.println(str[i]);
            }
        }
        
        return result.toArray(new String[0]);
    }
}