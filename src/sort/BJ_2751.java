package sort;

import java.io.*;

public class BJ_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];

        for (int j = 0; j < N; j++) {
            array[j] = Integer.parseInt(br.readLine());
        }
        br.close();

        heapSort(array);

        for (int i : array) {
            bw.write(i);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    // 힙 정렬 함수
    private static void heapSort(int[] array) {
        int length = array.length;

        for (int i = length/2 - 1; i >= 0; i--) {
            heapify(array, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }
    }

    // 힙 구조로 만드는 함수
    private static void heapify(int[] array, int n, int i) {
        int parent = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;

        if (left < n && array[parent] < array[left]) {
            parent = left;
        }

        if (right < n && array[parent] < array[right]) {
            parent = right;
        }

        if (i != parent) {
            swap(array, parent, i);
            heapify(array, n, parent);
        }
    }

    // swap 함수
    private static void swap(int[] array, int parent, int i) {
        int temp = array[parent];
        array[parent] = array[i];
        array[i] = temp;
    }
}
