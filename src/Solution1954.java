import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution1954 {
    public static void main(String args[]) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for(int test_case = 1; test_case <= T; test_case++) {
            int num = 1;
            int x = 0, y = 0;
            int direction = 0;

            int N = Integer.parseInt(reader.readLine());
            int [][] arr = new int[N][N];

            while (num <= N*N){
                arr[x][y] = num++;

                x += dx[direction];
                y += dy[direction];

                if(y >= N || x >= N || y < 0 || x < 0 || arr[x][y] != 0){
                    x -= dx[direction];
                    y -= dy[direction];

                    direction = (direction + 1) % 4; // 방향 전환

                    x += dx[direction];
                    y += dy[direction];
                }
            }


            // 결과 출력
            System.out.println("#" + test_case);

            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++)
                    System.out.print(arr[i][j] + " ");

                System.out.println();
            }
        }
    }
}

