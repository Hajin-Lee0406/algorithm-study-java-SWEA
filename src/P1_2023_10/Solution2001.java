package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2001 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수
        StringTokenizer st;

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(reader.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());  // 배열 사이즈
            int M = Integer.parseInt(st.nextToken());  // 파리채 크기

            // 리스트 담기
            int[][] numList = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(reader.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    numList[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 파리의 최대 합 구하기
            int max = 0;
            for (int i = 0; i < N - M + 1; i++) {
                for (int j = 0; j < N - M + 1; j++) {
                    int sum = 0;

                    for (int k = i; k < i + M; k++) {
                        for (int l = j; l < j + M; l++) {
                            sum = sum + numList[k][l];
                        }
                    }

                    if(sum > max){
                        max = sum;
                    }
                }
            }

            System.out.println("#" + test_case + " " + max);
        }
    }
}
