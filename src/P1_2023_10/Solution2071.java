package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2071 {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수
        StringTokenizer st;

        for (int test_case = 1; test_case <= T; test_case++) {
            // 입력값 모두 더하기
            st = new StringTokenizer(reader.readLine(), " ");

            int sum = 0;

            for (int i = 0; i < 10; i++) {
                sum = sum + Integer.parseInt(st.nextToken());
            }

            // 평균 구하기
            int average = Math.round((float) sum / 10);

            System.out.println("#" + test_case + " " + average);
        }
    }
}
