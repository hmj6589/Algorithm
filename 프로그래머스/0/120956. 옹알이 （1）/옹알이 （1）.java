class Solution {
    public int solution(String[] babbling) {
        // 조카가 발음할 수 있는 문자열
        String[] list = {"aya", "ye", "woo", "ma"};
        
        int result = 0;
        
        for (String a : babbling) {
            for (String s:list) a = a.replace(s, " ");
            if (a.replace(" ", "").isEmpty()) result++;
        }
        
        return result;
    }
}