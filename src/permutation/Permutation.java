package permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) throws IOException {
        int n = 3;
        int[] arr = {1, 2, 3};
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        int[][] map = new int[5][5];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int NN = Integer.parseInt(br.readLine());
        int a = 10;

        ArrayList<Integer> al = new ArrayList<>();
        
    }

    // 순서 없이 n 개중에서 r 개를 뽑는 경우
    // 사용 예시: permutation(arr, 0, n, 4);
    static void permutation(int[] arr, int depth, int n, int r) {
        if(depth == r) {
            for(int i=0; i<r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }


        for(int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    // 순서 있이 n 개 중에서 r 개를 뽑는 경우
    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if(depth == r) {
            print(output, r);
            return;
        }

        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                output[depth] = 0; // 이 줄은 없어도 됨
                visited[i] = false;;
            }
        }
    }

    // 배열 출력
    static void print(int[] arr, int r) {
        for(int i=0; i<r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
