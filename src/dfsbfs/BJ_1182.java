package dfsbfs;

import java.util.Scanner;

public class BJ_1182 {
    private static int cnt;
    private static int S;
    private static int sum;
    private static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        S = sc.nextInt();

        cnt = 0;
        sum = 0;

        arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            dfs(i);
        }

        System.out.println(cnt);

        sc.close();
    }

    static void dfs(int index) {
        sum += arr[index];

        if(sum == S) {
            cnt++;
        }

        for(int i = index + 1; i < arr.length; i++) {
            dfs(i);
        }

        sum -= arr[index];
    }
}
