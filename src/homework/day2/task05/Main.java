package homework.day2.task05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[0]);
    }
}
