class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<my_string.length();i++){
            char a = my_string.charAt(i);
            
            if(a==alp.charAt(0)){
                sb.append(Character.toUpperCase(a));
            } else {
                sb.append(a);
            }
        }
        
        return sb.toString();
    }
}