class Solution {
    public String solution(String myString, String pat) {        
        for(int i=myString.length();i>=0;i--){
            String str = myString.substring(0,i);
            
            if(str.endsWith(pat)){
                return str;
            }
        }
        
        return "";
    }
}