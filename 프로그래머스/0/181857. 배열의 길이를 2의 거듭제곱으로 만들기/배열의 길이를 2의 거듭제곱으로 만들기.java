import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;
        int log = (int) Math.ceil(Math.log(size)/Math.log(2));
        int s = (int) Math.pow(2, log);
        
        if(size == s){
            return arr;
        }
        
        int[] answer = Arrays.copyOf(arr, s);
        
        return answer;
    }
}