package homework.day3.task01;

public class Main {
    public static void main(String[] args) {
        Phone motorola = new Phone(111, 90, "Z1");
        Phone sony = new Phone(222, 97, "Super");
        Phone apple = new Phone(123, 83, "iPhone");
        System.out.println(motorola.toString() + " " + sony.toString() + " " + apple.toString());
        motorola.receiveCall(String.valueOf(motorola.getNumber()));
        sony.receiveCall(String.valueOf(sony.getNumber()));
        apple.receiveCall(String.valueOf(apple.getNumber()));

        Phone xiaomi = new Phone(apple.getNumber(), 103, apple.getModel());
        xiaomi.receiveCall("Dmitryi", 777);
        xiaomi.sendMessage(new int[]{111, 2222, 3333, 4555, 666, 77});
    }
}
