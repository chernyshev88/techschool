package homework.day2.task10;

public class Main {
    public static void main(String[] args) {
        int[] ar = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        System.out.print(" input array:");
        for (int x : ar) {
            System.out.print(x + " ");
        }
        int[] temp_ar = new int[ar.length];
        int tmp_count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0) {
                temp_ar[tmp_count] = ar[i];
                tmp_count++;
            }
        }
        ar = temp_ar;
        temp_ar = null;
        System.out.println();
        System.out.print("output array:");
        for (int x : ar) {
            System.out.print(x + " ");
        }
    }
}
