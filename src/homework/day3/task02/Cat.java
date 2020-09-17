package homework.day3.task02;

public class Cat extends Animal {
    private int quantityOfLife;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat makes noise");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }
}
