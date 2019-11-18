package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11403 {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[][] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        result = new int[N][N];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // dfs 시작
        for(int i = 0; i < N; i++) {
            dfs(i, i);
        }

        for (int i = 0; i < result.length; i++) {
            for(int j = 0; j< result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void dfs(int start, int next) {
        for(int i = 0; i < N; i++) {
            if(!visited[start][i] && map[next][i] == 1) {
                visited[start][i] = true;
                result[start][i] = 1;
                dfs(start, i);
            }
        }
    }
}
