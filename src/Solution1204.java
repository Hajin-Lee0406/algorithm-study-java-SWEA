import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Solution1204 {
    public static void main(String args[]) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        StringTokenizer st;

        for(int test_case = 1; test_case <= T; test_case++)
        {
            // 테스트 케이스의 번호
            int testNumber = Integer.parseInt(reader.readLine());

            // 점수 count
            st = new StringTokenizer(reader.readLine()," ");
            int[] scores = new int[101];

            for(int i=0;i<1000;i++){
                scores[Integer.parseInt(st.nextToken())]++;
            }

            // 최빈수 구하기
            int max = 0;
            int maxNum = 0;
            for (int i = 0; i < scores.length; i++) {
                if(scores[i] >= max){
                    max = scores[i];
                    maxNum = i;
                }
            }

            System.out.println("#" + testNumber + " " + maxNum);
        }
    }
}
