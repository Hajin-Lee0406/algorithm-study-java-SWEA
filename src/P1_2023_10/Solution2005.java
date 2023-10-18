package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2005 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(reader.readLine());  // 삼각형의 크기, N

            System.out.println("#" + test_case);

            int[] arr = {0};

            for (int i = 0; i < N; i++) {
                int[] arr2 = new int[i + 1];

                for (int j = 0; j < i + 1; j++) {
                    arr2[j] = (j == 0 || j == i) ? 1 : arr[j-1] + arr[j];
                    System.out.print(arr2[j] + " ");
                }

                System.out.println();
                arr = arr2;
            }
        }
    }
}
