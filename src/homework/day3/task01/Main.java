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

        Phone xiaomi = new Phone(apple, 95);
        xiaomi.receiveCall("Dmitryi", 777);
        xiaomi.sendMessage(new int[]{111, 2222, 3333, 4555, 666, 77});
    }
}

/*
∎ Создайте класс Phone, который содержит переменные number,
        model и weight.
        ∎ Создайте три экземпляра этого класса.
        ∎ Выведите на консоль значения их переменных.
        ∎ Добавить в класс Phone методы: receiveCall, имеет один
        параметр – имя звонящего. Выводит на консоль сообщение “Звонит
        {name}”. getNumber – возвращает номер телефона. Вызвать эти
        методы для каждого из объектов.
        ∎ Добавить конструктор в класс Phone, который принимает на вход
        три параметра для инициализации переменных класса - number,
        model и weight.
        ∎ Добавить конструктор, который принимает на вход два параметра
        для инициализации переменных класса - number, model.
        ∎ Добавить конструктор без параметров.
        ∎ Вызвать из конструктора с тремя параметрами конструктор с
        двумя.
        ∎ Добавьте перегруженный метод receiveCall, который принимает
        два параметра - имя звонящего и номер телефона звонящего.
        Вызвать этот метод.
        ∎ Создать метод sendMessage с аргументами переменной длины.
        Данный метод принимает на вход номера телефонов, которым
        будет отправлено сообщение. Метод выводит на консоль номера
        этих телефонов.*/
