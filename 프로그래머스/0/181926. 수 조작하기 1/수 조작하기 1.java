class Solution {
    public int solution(int n, String control) {
        
        char [] x = control.toCharArray();
        
        for (int i=0;i<control.length();i++){
            if(x[i]=='w'){
                n+=1;
            } else if(x[i]=='s'){
                n-=1;
            } else if(x[i]=='d'){
                n+=10;
            } else {
                n-=10;
            }
        }
        
        return n;
    }
}