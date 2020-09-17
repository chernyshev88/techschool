package homework.day3.task02;

public class Horse extends Animal {
    private boolean saddle;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse makes noise");
    }

    @Override
    public void eat() {
        System.out.println("The horse eating grass");
    }
}
