package combination;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
        int result = combinationNum(5, 2);
        System.out.println(result + " 개");

        LinkedList<Integer> arList = new LinkedList<>();


        int[] list = new int[2];
        //printCombination(list, 5, 2, 0, 1);
        combinationH(list, 5, 2, 0, 1);
        //combLinked(arList, 0 , 5, 2);
    }

    static int combinationNum(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else {
            return combinationNum(n - 1, r - 1) + combinationNum(n - 1, r);
        }
    }

    static void combLinked(LinkedList<Integer> arr, int index, int n, int r) {
        if (r == 0) {
            for(int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        if (n == index) return;

        arr.add(index);
        combLinked(arr, index + 1, n, r - 1);
        arr.removeLast();
        combLinked(arr, index + 1, n, r);
    }

//    static void printCombination(int[] arr, int n, int r, int index, int target) {
//        if (r == 0) {
//            for(int i : arr) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//            return;
//        }
//        if (n == target) return;
//
//        arr[index] = target;
//        printCombination(arr, n, r - 1, index + 1, target + 1);
//        printCombination(arr, n, r, index, target + 1);
//    }

    static void combinationH(int[] arr, int n, int r, int index, int target) {
        if (r == 0) {
            for(int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        if (n == target) return;

        arr[index] = target;
        combinationH(arr, n, r - 1, index + 1, target);
        combinationH(arr, n, r, index, target + 1);
    }
}
