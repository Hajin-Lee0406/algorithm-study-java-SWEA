package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1974 {

    private static final int PASS = 1;
    private static final int FAIL = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수
        StringTokenizer st;

        testCaseLoop:
        for (int test_case = 1; test_case <= T; test_case++) {
            // 1. 리스트 담기
            int[][] numList = new int[9][9];

            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(reader.readLine(), " ");
                for (int j = 0; j < 9; j++) {
                    numList[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int result = 1;

            // 가로, 세로 검사
            for (int i = 0; i < 9; i++) {
                int[] arr = new int[9];
                int[] arr2 = new int[9];

                for (int j = 0; j < 9; j++) {
                    arr[j] = numList[i][j];
                    arr2[j] = numList[j][i];
                }

                // 가로 세로 검사에서 실패하면 바로 출력하고 테스트케이스 반복문을 탈출
                result = valid(arr);
                if (result == 0) {
                    System.out.println("#" + test_case + " " + result);
                    continue testCaseLoop;
                }

                result = valid(arr2);
                if (result == 0) {
                    System.out.println("#" + test_case + " " + result);
                    continue testCaseLoop;
                }
            }

            // 격자 검사
            for (int l = 0; l < 9; l = l + 3) {
                int[] arr = new int[9];
                int index = 0;

                for (int i = l; i < l + 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        arr[index] = numList[i][j];
                        index++;
                    }
                }

                result = valid(arr);

                if (result == 0) {
                    System.out.println("#" + test_case + " " + result);
                    continue testCaseLoop;
                }
            }

            System.out.println("#" + test_case + " " + result);
        }
    }

    // 배열 검사
    private static int valid(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) return FAIL;
        }

        return PASS;
    }
}
