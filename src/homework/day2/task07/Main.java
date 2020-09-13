package homework.day2.task07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите код города:");
        Scanner scanner = new Scanner(System.in);
        int minutes = 10;
        switch (scanner.nextInt()) {
            case (905):
                System.out.println("Москва. Стоимость разговора:" + (4.15 * minutes));
                break;
            case (194):
                System.out.println("Ростов. Стоимость разговора:" + (1.98 * minutes));
                break;
            case (491):
                System.out.println("Краснодар. Стоимость разговора:" + (2.69 * minutes));
                break;
            case (800):
                System.out.println("Киров. Стоимость разговора:" + (5.00 * minutes));
                break;
            default:
                System.out.println("Не правильный код города.");
                break;
        }
    }
}
