import java.util.*;

class Solution {
    public int solution(int[] arr) {
        
        int i=0;
        
        while(true){
            int[] arr2 = Arrays.copyOfRange(arr, 0, arr.length);
            
            for(int a=0;a<arr.length;a++){
                if(arr[a]>=50 && arr[a]%2==0){
                    arr[a]=arr[a]/2;
                }else if(arr[a]<50 && arr[a]%2!=0){
                    arr[a]=arr[a]*2+1;
                }
            }
            i++;
            
            if(Arrays.equals(arr, arr2)){
                break;
            }
        }
        
        return i-1;
    }
}