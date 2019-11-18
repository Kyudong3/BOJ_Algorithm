package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_2583 {
    private static boolean[][] visited;
    private static int count;
    private static int area;
    private static ArrayList<Integer> list;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int M;
    private static int N;
    private static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[M][N];
        list = new ArrayList<>();
        count = 0;

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int leftDownX = Integer.parseInt(st.nextToken());
            int leftDownY = Integer.parseInt(st.nextToken());
            int rightUpX = Integer.parseInt(st.nextToken());
            int rightUpY = Integer.parseInt(st.nextToken());

            for (int j = leftDownY; j < rightUpY; j++) {
                for (int k = leftDownX; k < rightUpX; k++) {
                    visited[j][k] = true;
                }

            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                area = 0;
                if (!visited[i][j]) {
                    dfs(i, j);
                    count++;
                    list.add(area);
                }
            }
        }

        System.out.println(count);

        Collections.sort(list);

        for (int i :
                list) {
            System.out.print(i + " ");
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        area++;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 0 && newY >= 0 && newX < M && newY < N) {
                if (!visited[newX][newY]) {
                    dfs(newX, newY);
                }
            }
        }

    }
}
