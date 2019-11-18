package dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_1697 {
    private static int[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subinNum = sc.nextInt();
        int brotherNum = sc.nextInt();

        visited = new int[100001];

        bfs(subinNum, brotherNum);
    }

    private static void bfs(int startNum, int end) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startNum);
        visited[startNum] = 0;

        while (!queue.isEmpty()) {
            int poll = queue.poll();

            if (poll == end) {
                System.out.println(visited[poll]);
                break;
            }

            if (poll + 1 <= 100000 && visited[poll + 1] == 0) {
                queue.add(poll + 1);
                visited[poll + 1] = visited[poll] + 1;
            }

            if (poll - 1 >= 0 && visited[poll - 1] == 0) {
                queue.add(poll - 1);
                visited[poll - 1] = visited[poll] + 1;
            }

            if (poll * 2 <= 100000 && visited[poll * 2] == 0) {
                queue.add(poll * 2);
                visited[poll * 2] = visited[poll] + 1;
            }

        }
    }
}
