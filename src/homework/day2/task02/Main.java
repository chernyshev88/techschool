package homework.day2.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] c = reader.readLine().toCharArray();
        System.out.println(getSum(c));

    }

    public static int getSum(char[] c) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + Integer.valueOf(String.valueOf(c[i]));
        }
        return sum;
    }
}
