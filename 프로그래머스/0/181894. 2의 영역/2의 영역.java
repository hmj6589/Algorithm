import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int a = -1;
        int b = -1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                if(a==-1) a=i;
                b=i;
            }
        }
        
        if(a==-1){
            result.add(-1);
        } else if(a==b){
            result.add(arr[a]);
        } else {
            for(int i=a;i<b+1;i++){
            result.add(arr[i]);
            }   
        }
        
        
        return result.stream().mapToInt(i->i).toArray();
    }
}