package P1_2023_10;

import java.util.Scanner;

public class Solution2072 {
    public static void main(String[] args) {
        // 테스트 케이스의 개수 T
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            // 입력받은 숫자 리스트로 변환
            int[] numList = new int[10];
            for (int j=0; j<10; j++){
                numList[j] = sc.nextInt();
            }

            // 홀수만 더하기
            int sum = 0;
            for (Integer num : numList) {
                if(isOddNum(num)){
                    sum = sum + num;
                }
            }
            System.out.println("#" + (i+1) + " " + sum);
        }
    }

    private static boolean isOddNum(int num){
        return num % 2 != 0;
    }
}