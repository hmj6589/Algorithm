import java.util.*;

class Solution {
    public int solution(String binomial) {
        String[] str = binomial.trim().split("\\s+");
        // List<String> list = new ArrayList<>();
        // for(String i:str){
        //     if(!i.isEmpty()) list.add(i);
        // }
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[2]);
        
        if(str[1].equals("+")){
            return num1+num2;
        } else if(str[1].equals("-")){
            return num1-num2;
        } else {
            return num1*num2;
        }
    }
}