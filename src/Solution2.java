import java.util.*;
import java.io.*;

public class Solution2 {
    public static void main(String args[]) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T;
        T = Integer.parseInt(reader.readLine());
        StringTokenizer st;
        for(int test_case = 1; test_case <= T; test_case++)
        {
            // 입력값 리스트로 저장
            int n = Integer.parseInt(reader.readLine());
            st = new StringTokenizer(reader.readLine()," ");
            int[] numList = new int[n];
            for(int i=0;i<n;i++){
                numList[i] = Integer.parseInt(st.nextToken());
            }

            // 최대 이익 구하기
            long sum = 0;
            int max = 0;
            for (int i = n-1; i > -1; i--) {
                if (max > numList[i]){
                    sum = sum + (max - numList[i]);
                }else{
                    max = numList[i];
                }
            }
            System.out.println("#" + test_case + " " + sum);
        }
    }
}
