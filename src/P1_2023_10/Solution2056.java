package P1_2023_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2056 {
    static int[] maxDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 개수

        for (int test_case = 1; test_case <= T; test_case++) {
            // 년, 월, 일 입력 받기
            String input = reader.readLine();

            String year = input.substring(0, 4);
            int month = Integer.parseInt(input.substring(4, 6));
            int day = Integer.parseInt(input.substring(6, 8));

            // 날짜 유효성 검증
            if(month < 13 && month >0 && day <= maxDays[month]){
                System.out.println("#" + test_case + " " + year + "/" +String.format("%02d", month) + "/" +  String.format("%02d", day));
            }else{
                System.out.println("#" + test_case + " -1");
            }
        }
    }
}
