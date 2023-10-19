package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2007 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수

        for (int test_case = 1; test_case <= T; test_case++) {
            String input = reader.readLine();
            StringBuilder madi = new StringBuilder();

            for (int i = 0; i < 30; i++) {
                String s = input.substring(i, i + madi.length());
                if (madi.toString().equals(s) && !s.equals("")){
                    break;
                }
                madi.append(input.charAt(i));
            }

            System.out.println("#" + test_case + " " + madi.length());
        }
    }
}
