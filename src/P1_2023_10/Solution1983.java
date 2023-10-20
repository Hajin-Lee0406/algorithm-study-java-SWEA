package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution1983 {
    private static final String[] grades = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수
        StringTokenizer st;

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(reader.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());  // 총 학생의 수
            int K = Integer.parseInt(st.nextToken());  // 학점을 알고 싶은 학생의 번호

            // 리스트 담기
            double[] scoreList = new double[N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(reader.readLine(), " ");
                int midterm = Integer.parseInt(st.nextToken());
                int finals = Integer.parseInt(st.nextToken());
                int assignment = Integer.parseInt(st.nextToken());

                scoreList[i] = totalScore(midterm, finals, assignment);
            }

            double score = scoreList[K - 1];
            Arrays.sort(scoreList);

            int index = -1;
            for (int i = 0; i < scoreList.length; i++) {
                if (scoreList[i] == score) {
                    index = i; // score를 찾았을 때 해당 인덱스를 저장하고 반복문을 종료
                    break;
                }
            }

            int grade = index / (N / 10);

            System.out.println("#" + test_case + " " + grades[grade]);
        }
    }

    // 총점 계산 함수
    private static double totalScore(int midterm, int finals, int assignment) {
        return midterm * 0.35 + finals * 0.45 + assignment * 0.2;
    }
}
