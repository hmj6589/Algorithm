import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 1; i <= 1000000; i++) {
            String str = Integer.toString(i);
            if (isValid(str)) {
                int num = Integer.parseInt(str);
                if (num >= l && num <= r) {
                    result.add(num);
                }
            }
        }
        
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        
        Collections.sort(result);
        return result.stream().mapToInt(i -> i).toArray();
    }
    
    private static boolean isValid(String str) {
        for (char c : str.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}