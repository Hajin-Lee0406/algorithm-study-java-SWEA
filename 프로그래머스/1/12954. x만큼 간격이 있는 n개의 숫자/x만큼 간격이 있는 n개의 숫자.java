import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();
        
        long value = x;
        while(n != 0) {
            list.add(value);
            value = value + x;
            n = n - 1;
        }
        
        long[] answer = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}