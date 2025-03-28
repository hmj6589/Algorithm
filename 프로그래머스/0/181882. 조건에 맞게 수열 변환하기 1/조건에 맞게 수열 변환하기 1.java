import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=50 && arr[i]%2==0){
                result.add(arr[i]/2);
            } else if(arr[i]<50 && arr[i]%2!=0){
                result.add(arr[i]*2);
            } else {
                result.add(arr[i]);
            }
        }
        
        return result.stream().mapToInt(i->i).toArray();
    }
}