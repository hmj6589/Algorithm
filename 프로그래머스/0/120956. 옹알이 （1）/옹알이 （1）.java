class Solution {
    public int solution(String[] babbling) {
        String[] list = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(String a:babbling) {
            for(String s:list) a=a.replace(s," ");
            if (a.replace(" ","").isEmpty()) answer++;
        }
        
        return answer;
    }
}