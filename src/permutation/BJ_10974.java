package permutation;

import java.util.Scanner;

public class BJ_10974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        boolean[] visited = new boolean[N];
        int[] output = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        permutation(arr, visited, output, 0, N, N);

        sc.close();
    }

    static void permutation(int[] arr, boolean[] visited, int[] output, int depth, int n, int r) {
        if(depth == r) {
            for(int i = 0; i < r; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, visited, output, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }
}
