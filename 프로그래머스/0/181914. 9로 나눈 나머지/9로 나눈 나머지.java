import java.util.*;

class Solution {
    public int solution(String number) {
        ArrayList<Integer> num = new ArrayList<>();
        
        for(int i=0;i<number.length();i++){
            num.add(Integer.parseInt(number.substring(i,i+1)));
        }
        
        int sum=0;
        
        for(int i=0;i<num.size();i++){
            sum+=num.get(i);
        }
        
        
        return sum%9;
    }
}