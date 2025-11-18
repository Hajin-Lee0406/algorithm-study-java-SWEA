import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public Integer[] solution(int[] numbers) {
        List<Integer> temp = new ArrayList<>();
        for (int num : numbers) {
            temp.add(num*2);
        }
        
        return temp.toArray(new Integer[temp.size()]);
    }
}