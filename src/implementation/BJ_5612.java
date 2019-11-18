package implementation;

import java.util.Scanner;

public class BJ_5612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 조사한 시간
        int n = sc.nextInt();
        // 차량의 수
        int m = sc.nextInt();

        int max = 0;

        for(int i = 0; i < n; i++) {
            int in = sc.nextInt();
            int out = sc.nextInt();

            m = m + in - out;

            if (m < 0) {
                System.out.println(0);
                return;
            }

            max = Math.max(max, m);
        }

        System.out.println(max);
    }
}
