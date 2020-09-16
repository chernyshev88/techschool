package homework.day2.task10;

public class Main {
    public static void main(String[] args) {
        int[] inArray = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        System.out.print(" input array:");
        for (int x : inArray) {
            System.out.print(x + " ");
        }
        int[] tmpArray = new int[inArray.length];
        int tmpCount = 0;
        for (int i = 0; i < inArray.length; i++) {
            if (inArray[i] != 0) {
                tmpArray[tmpCount] = inArray[i];
                tmpCount++;
            }
        }
        inArray = tmpArray;
        System.out.println();
        System.out.print("output array:");
        for (int x : inArray) {
            System.out.print(x + " ");
        }
    }
}
