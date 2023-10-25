package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution1946 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(reader.readLine());
            StringTokenizer st;

            List<String> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(reader.readLine(), " ");
                String alphabet = st.nextToken();
                int count = Integer.parseInt(st.nextToken());

                for (int j = 0; j < count; j++) {
                    list.add(alphabet);
                }
            }

            System.out.println("#" + test_case);
            int cnt = 0;
            for (String s : list) {
                System.out.print(s);
                cnt++;

                if (cnt == 10) {
                    System.out.println();
                    cnt = 0;
                }
            }
            System.out.println();
        }
    }
}
