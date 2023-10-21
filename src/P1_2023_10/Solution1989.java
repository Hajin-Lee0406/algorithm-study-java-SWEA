package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1989 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수

        for (int test_case = 1; test_case <= T; test_case++) {
            int result = 1;

            String input = reader.readLine();
            int length = input.length();

            for (int i = 0; i < length; i++) {
                if (input.charAt(i) != input.charAt(length - 1 - i)) {
                    result = 0;
                    break;
                }
            }

            System.out.println("#" + test_case + " " + result);
        }
    }
}
