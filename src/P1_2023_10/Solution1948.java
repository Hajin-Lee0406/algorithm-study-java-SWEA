package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1948 {
    private static final int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수
        StringTokenizer st;

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(reader.readLine(), " ");

            int month1 = Integer.parseInt(st.nextToken());
            int day1 = Integer.parseInt(st.nextToken());
            int month2 = Integer.parseInt(st.nextToken());
            int day2 = Integer.parseInt(st.nextToken());

            int sum = 0;
            int count = month2 - month1;
            for (int i = 0; i < count; i++) {
                sum = sum + days[month1 - 1];
                month1++;
            }

            sum = sum + (day2 - day1 + 1);

            System.out.println("#" + test_case + " " + sum);
        }
    }
}
