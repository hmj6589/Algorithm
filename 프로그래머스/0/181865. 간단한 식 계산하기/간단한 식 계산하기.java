import java.util.*;

class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        List<String> list = new ArrayList<>();
        for(String i:str){
            if(!i.isEmpty()) list.add(i);
        }
        int num1 = Integer.parseInt(list.get(0));
        int num2 = Integer.parseInt(list.get(2));
        
        if((list.get(1)).equals("+")){
            return num1+num2;
        } else if((list.get(1)).equals("-")){
            return num1-num2;
        } else {
            return num1*num2;
        }
    }
}