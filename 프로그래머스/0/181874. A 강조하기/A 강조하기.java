class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<myString.length();i++){
            char a = myString.charAt(i);
            
            if(a=='a' || a=='A'){
                sb.append('A');
            } else {
                sb.append(Character.toLowerCase(a));
            }
        }
        
        return sb.toString();
    }
}