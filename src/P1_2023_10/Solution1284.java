package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1284 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수
        StringTokenizer st;

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(reader.readLine(), " ");
            int P = Integer.parseInt(st.nextToken()); // A사
            int Q = Integer.parseInt(st.nextToken()); // B사
            int R = Integer.parseInt(st.nextToken()); // B사
            int S = Integer.parseInt(st.nextToken()); // B사
            int W = Integer.parseInt(st.nextToken()); // 한 달간 사용하는 수도 양

            int chargeA = W * P;
            int chargeB = R > W ? Q : Q + (W - R) * S;

            System.out.println("#" + test_case + " " + Math.min(chargeA, chargeB));
        }
    }
}
