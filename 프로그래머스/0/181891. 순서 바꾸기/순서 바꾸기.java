import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] b = Arrays.copyOfRange(num_list, 0, n);
        int[] a = Arrays.copyOfRange(num_list, n, num_list.length);
        
        int[] result = new int [a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        
        return result;
    }
}