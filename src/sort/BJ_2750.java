package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BJ_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        /* Collection 함수 사용해서 정렬하기 */
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < N; i++) {
//            list.add(sc.nextInt());
//        }
//
//        Collections.sort(list);
//
//        for (int i : list) {
//            System.out.println(i);
//        }

        // 배열 이용해서 Bubble sort
        int[] array = new int[N];

        for (int j = 0; j < N; j++) {
            array[j] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N - 1; k++) {
                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
