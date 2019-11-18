package implementation;

import java.util.Scanner;

public class BJ_9226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.next();

            if (input.equals("#")) {
                break;
            }

            StringBuilder bf = new StringBuilder();


            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'o' || input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'u') {
                    bf.insert(0, input.substring(i).toCharArray());
                    break;
                } else bf.append(input.charAt(i));
            }

            bf.append("ay");

            System.out.println(bf.toString());
        }
    }
}
