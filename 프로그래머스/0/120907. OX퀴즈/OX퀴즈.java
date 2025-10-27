import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0;i < quiz.length;i++) {
            String[] list = quiz[i].split(" ");
            
            int x = Integer.parseInt(list[0]);
            String op = list[1];
            int y = Integer.parseInt(list[2]);
            int z = Integer.parseInt(list[4]);
            
            int calc = op.equals("+") ? x + y : x - y;
            
            answer[i] = (calc == z) ? "O" : "X";
        }
        
        return answer;
    }
}