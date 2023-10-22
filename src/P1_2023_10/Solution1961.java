package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1961 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수
        StringTokenizer st;

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(reader.readLine()); // N * N 행렬


            // 리스트 담기 -> 1 차원으로 순서대로 담는다.
            int[] arr = new int[N * N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(reader.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    arr[N * i + j] = Integer.parseInt(st.nextToken());
                }
            }


            int[][] arr90 = new int[N][N];
            int cnt = 0;
            for (int i = N - 1; i >= 0; i--) {
                for (int j = 0; j < N; j++) {
                    arr90[j][i] = arr[cnt];
                    cnt++;
                }
            }

            cnt = 0;
            int[][] arr180 = new int[N][N];
            for (int i = N - 1; i >= 0; i--) {
                for (int j = N - 1; j >= 0; j--) {
                    arr180[i][j] = arr[cnt];
                    cnt++;
                }
            }

            cnt = 0;
            int[][] arr270 = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = N - 1; j >= 0; j--) {
                    arr270[j][i] = arr[cnt];
                    cnt++;
                }
            }

            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr90[i][j]);
                }
                System.out.print(" ");

                for (int j = 0; j < N; j++) {
                    System.out.print(arr180[i][j]);
                }
                System.out.print(" ");

                for (int j = 0; j < N; j++) {
                    System.out.print(arr270[i][j]);
                }
                System.out.println();
            }
        }
    }
}
