import java.util.*;

class Solution {
    public int[] solution(int n) {
        int lastNum = 1;
        int size = n % 2 == 0 ? n / 2 : n / 2 + 1;
        
        int[] answer = new int[size];
        int i = 0;
        while (lastNum <= n) {
           answer[i] = lastNum;
           lastNum += 2;
            i++;
        }

        return answer;
    }
}