package dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_1260 {
    private static int[][] map;
    private static boolean[] visited;
    private static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int v = sc.nextInt();
        int m = sc.nextInt();

        map = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < v; i++) {
            int nodeFirst = sc.nextInt();
            int nodeSecond = sc.nextInt();

            map[nodeFirst][nodeSecond] = 1;
            map[nodeSecond][nodeFirst] = 1;
        }

        dfs(m);

        for (int i = 1; i < n + 1; i++) {
            visited[i] = false;
        }

        System.out.println();

        bfs(m);

    }

    private static void dfs(int start) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int i = 1; i < n + 1; i++) {
            if ((map[start][i] == 1) && (!visited[i])) {
                dfs(i);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        System.out.print(start + " ");

        int poll;
        while (!queue.isEmpty()) {
            poll = queue.poll();
            for (int i = 1; i < n + 1; i++) {
                if (map[poll][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
