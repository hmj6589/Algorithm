import java.util.*;

class Solution {
    public int[] solution(int money) {
        List<Integer> list = new ArrayList<>();
        
        list.add(money/5500);
        list.add(money%5500);
        
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++) answer[i] = list.get(i);
        
        return answer;
    }
}