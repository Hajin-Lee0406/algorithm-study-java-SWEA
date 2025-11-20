import java.util.*;

class Solution {
    public int solution(int[] array) {
        // map을 애용해 빈도 count
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // 최빈값 도출
        int count = 0;
        int max = Collections.max(map.values());
        int ans = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (max == value) {
                count++;
                ans = entry.getKey();
            }
        }
        
        
        return count == 1 ? ans : -1 ;
    }
}