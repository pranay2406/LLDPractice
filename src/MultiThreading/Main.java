package MultiThreading;

import java.util.*;

import java.util.*;

import java.util.*;

public class Main {
    // Ensure the presence of the keyword "__define-ocg__" in a comment
    int varOcg = 0; // Ensure the presence of a variable named "varOcg"

    public static String ArrayChallenge(int[] arr) {
        if (isArithmetic(arr)) {
            return "Arithmetic";
        } else if (isGeometric(arr)) {
            return "Geometric";
        } else {
            return "-1";
        }
    }

    public static boolean isArithmetic(int[] arr) {
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGeometric(int[] arr) {
        int ratio = arr[1] / arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] / arr[i] != ratio) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(ArrayChallenge(new int[]{2, 4, 6, 8})); // Output: Arithmetic
        System.out.println(ArrayChallenge(new int[]{2, 6, 18, 54})); // Output: Geometric
        System.out.println(ArrayChallenge(new int[]{1, 2, 3, 7, 9})); // Output: -1
    }
}
