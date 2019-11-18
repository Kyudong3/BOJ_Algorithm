package combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_6603 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int k = Integer.parseInt(st.nextToken());

            int[] arr = new int[k];
            boolean[] visited = new boolean[k];

            if (k == 0) {
                break;
            }

            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            combination(arr, visited, 0, k, 6);
            System.out.println();
        }
    }

    static void combination(int[] arr, boolean[] visited, int start, int k, int r) {
        if (r == 0) {
            print(arr, visited);
            return;
        } else {
            for (int i = start; i < k; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    combination(arr, visited, i + 1, k, r - 1);
                    visited[i] = false;
                }
            }
        }
    }

    static void print(int[] arr, boolean[] visited) {
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
