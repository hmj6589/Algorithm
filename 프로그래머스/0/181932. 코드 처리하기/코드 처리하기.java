class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i=0;i<code.length();i++){
            if(code.substring(i,i+1).equals("1") && mode == 0){
                mode = 1;
            } else if (code.substring(i,i+1).equals("1") && mode == 1){
                mode = 0;
            }
            
            if (mode == 1 && !code.substring(i,i+1).equals("1")) {
                if(i%2!=0) answer += code.substring(i,i+1);
            } else if (mode == 0 && !code.substring(i,i+1).equals("1")) {
                if(i%2==0 || i==0) answer += code.substring(i,i+1);
            }
        }
        
        return answer == "" ? "EMPTY" : answer;
    }
}