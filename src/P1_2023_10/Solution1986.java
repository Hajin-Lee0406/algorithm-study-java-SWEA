package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1986 {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(reader.readLine());

            int sum = 0;

            for (int i = 1; i <= N; i++) {
                sum = (i % 2 == 0) ? sum - i : sum + i;
            }

            System.out.println("#" + test_case + " " + sum);
        }
    }
}
