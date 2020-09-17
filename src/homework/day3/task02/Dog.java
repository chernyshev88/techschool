package homework.day3.task02;

public class Dog extends Animal {
    private boolean collar;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog makes noise");
    }

    @Override
    public void eat() {
        System.out.println("The dogs is eating");
    }
}
