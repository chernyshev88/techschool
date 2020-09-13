package homework.day2.task06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 0) {
            System.out.println("Нулевое число");
        } else {
            System.out.println((a > 0 ? "положительное" : "отрицательное") + " " + (a % 2 == 0 ? "четное" : "нечетное") + " " + "число");
        }
    }
}
