package homework.day3.task02;

public class Animal {
    private String food, location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Animal make noise");
    }

    public void eat() {
        System.out.println("The animal eats");
    }

    public void sleep() {
        System.out.println("Sleep");
    }
}
