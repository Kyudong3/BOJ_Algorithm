package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = br.readLine().split(" ");

        String wordA = words[0];
        String wordB = words[1];
        int indexA = -1;
        int indexB = -1;

        boolean flag = false;
        for (int i = 0; i < wordA.length(); i++) {
            char alphabet = wordA.charAt(i);
            for (int j = 0; j < wordB.length(); j++) {
                if (alphabet == wordB.charAt(j)) {
                    flag = true;
                    indexA = i;
                    indexB = j;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        for (int i = 0; i < wordB.length(); i++) {
            for (int j = 0; j < wordA.length(); j++) {
                if (i == indexB) {
                    System.out.print(wordA);
                    break;
                } else {
                    if (indexA == j) System.out.print(wordB.charAt(i));
                    else System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
