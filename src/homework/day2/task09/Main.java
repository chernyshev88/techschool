package homework.day2.task09;

public class Main {
    public static void main(String[] args) {
        int[] ar = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        System.out.print(" input array: ");
        for (int x : ar) {
            System.out.print(x + " ");
        }

        System.out.println();
        int[] temp_ar = new int[14];
        for (int a = ar.length - 1, i = 0; a >= 0; a--, i++) {
            temp_ar[i] = ar[a];
        }

        ar = temp_ar;
        System.out.print("output array: ");
        for (int x : ar) {
            System.out.print(x + " ");
        }

    }
}
