class Solution {
    public String solution(String my_string, String overwrite_string, int s) {        
        String a = my_string.substring(0,s);
        String b = my_string.substring(s+overwrite_string.length(), my_string.length());
        
        return a+overwrite_string+b;
    }
}