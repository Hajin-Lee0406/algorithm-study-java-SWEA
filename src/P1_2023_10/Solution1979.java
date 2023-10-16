package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1979 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수
        StringTokenizer st;

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(reader.readLine(), " ");
            int N = Integer.parseInt(st.nextToken()); // N * N 단어퍼즐
            int K = Integer.parseInt(st.nextToken()); // 단어의 길이

            // 리스트 담기
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(reader.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int result = 0;

            // 가로 탐색
            for (int i = 0; i < N; i++) {
                int cnt = 0;

                for (int j = 0; j < N; j++) {
                    if (arr[i][j] == 1){
                        while (j < N && arr[i][j] == 1){
                            cnt++;
                            j++;
                        }

                        if (cnt == K){
                            result++;
                        }

                        cnt = 0;
                    }
                }
            }

            // 세로 탐색
            for (int i = 0; i < N; i++) {
                int cnt = 0;

                for (int j = 0; j < N; j++) {
                    if (arr[j][i] == 1){
                        while (j < N && arr[j][i] == 1){
                            cnt++;
                            j++;
                        }

                        if (cnt == K){
                            result++;
                        }

                        cnt = 0;
                    }
                }
            }

            System.out.println("#" + test_case + " " + result);
        }
    }
}
