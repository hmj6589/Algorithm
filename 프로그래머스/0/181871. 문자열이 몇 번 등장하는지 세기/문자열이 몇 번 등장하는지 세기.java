class Solution {
    public int solution(String myString, String pat) {
        int num =0;
        
        for(int i=0;i<myString.length();i++){
            if((myString.charAt(i) == pat.charAt(0)) && i+pat.length() <= myString.length()){
                String str = myString.substring(i,i+pat.length());
                
                if(str.equals(pat)){
                    num++;
                }
            }
        }
        
        return num;
    }
}