package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2058 {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String N = reader.readLine(); // 자연수 N

        // 리스트 담기
        int sum = 0;
        for (int i = 0; i < N.length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(N.charAt(i)));
        }

        System.out.println(sum);
    }
}
