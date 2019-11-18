package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BJ_2309 {
    static int sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        sum = 0;

        for(int i = 0; i < 9; i++) {
            int height = sc.nextInt();
            arr[i] = height;
            sum += height;
        }

        Arrays.sort(arr);

        boolean isTrue = false;

        for(int i = 0; i < 9; i++) {
            if (isTrue) {
                break;
            }
            for(int j = 0; j < 9; j++) {
                if (i == j) {
                    continue;
                }

                if ((sum - arr[i] - arr[j]) == 100) {
                    isTrue = true;
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }

        }

        for (int i: arr) {
            if (i != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
