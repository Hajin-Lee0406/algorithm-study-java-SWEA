package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1966 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수
        StringTokenizer st;

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(reader.readLine());  // 길이 N

            int[] arr = new int[N];
            st = new StringTokenizer(reader.readLine(), " ");

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            System.out.print("#" + test_case + " ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
