package homework.day2.task08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Дан массив: 1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2");
        int[] a = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        Arrays.sort(a);
        System.out.println("Максимальное значение:" + a[a.length - 1]);
        System.out.println("Сумма положительных эл-ов:" + getSumPositive(a));
        System.out.println("Сумма четных отрицательных эл-ов:" + getSumEvenNegative(a));
        System.out.println("Кол-во положительных эл-ов:" + getCountPositive(a));
        System.out.println("Среднее арифметическое отрицательных эл-ов:" + getNegativeArithmeticMean(a));
    }

    public static int getSumPositive(int[] a) {
        int sum = 0;
        for (int x : a) {
            if (x > 0) {
                sum = sum + x;
            }
        }
        return sum;
    }

    public static int getSumEvenNegative(int[] a) {
        int sum = 0;
        for (int x : a) {
            if (x < 0 && x % 2 == 0) {
                sum = sum + x;
            }
        }
        return sum;
    }

    public static int getCountPositive(int[] a) {
        int count = 0;
        for (int x : a) {
            if (x > 0) {
                count++;
            }
        }
        return count;
    }

    public static double getNegativeArithmeticMean(int[] a) {
        int sum = 0;
        int count = 0;
        for (int x : a) {
            if (x < 0) {
                sum = sum + x;
                count++;
            }
        }
        return (double) sum / count;
    }
}
