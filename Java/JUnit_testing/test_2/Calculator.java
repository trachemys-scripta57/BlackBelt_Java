package JUnit_testing.test_2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Calculator {
    // method that returns maximum number
    public static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
    // method that returns cube of the given number
    public static int cube(int n) {
        return n*n*n;
    }
    // method that returns reverse words

    public static String reverseWord(String str) {
        StringBuilder result = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(str, " ");

        while (tokenizer.hasMoreTokens()) {
            StringBuilder sb = new StringBuilder();
            sb.append(tokenizer.nextToken());
            sb.reverse();

            result.append(sb);
            result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Введите слово (фразу) для переворачивания: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(reverseWord(str));
    }
}
