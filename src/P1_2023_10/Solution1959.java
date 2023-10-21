package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1959 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수
        StringTokenizer st;

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(reader.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());  // 배열 A의 크기
            int M = Integer.parseInt(st.nextToken());  // 배열 B의 크기


            int[] A = new int[N];
            int[] B = new int[M];

            // 리스트 담기 - A
            st = new StringTokenizer(reader.readLine(), " ");
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            // 리스트 담기 - B
            st = new StringTokenizer(reader.readLine(), " ");
            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            // 대소 비교 - 무조건 B 배열의 사이즈를 크게 만들다
            if (N > M) {
                int temp = N;
                N = M ;
                M = temp;

                int[] tempArr = A;
                A = B;
                B = tempArr;
            }


            int max = 0;
            for (int i = 0; i < M - N + 1; i++) {
                int hap = 0;

                for (int j = 0; j < N; j++) {
                    hap = hap + A[j] * B[i + j];
                }

                max = Math.max(max, hap);
            }

            System.out.println("#" + test_case + " " + max);
        }
    }
}
