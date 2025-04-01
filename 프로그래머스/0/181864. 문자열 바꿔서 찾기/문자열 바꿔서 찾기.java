class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<myString.length();i++){
            char ch = myString.charAt(i);
            sb.append((ch=='A') ? 'B' : 'A');
        }
        
        if((sb.toString()).contains(pat)) return 1;
        
        return 0;
    }
}