package homework.day3.task01;

public class Phone {
    private int number, weight;
    private String model;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }


    public Phone(int number, int weight, String model) {
        this(number, model);
        this.model = model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);

    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name);
        System.out.println("Номер " + number);

    }

    public void sendMessage(int[] num) {
        for (int j : num) {
            System.out.println(j);
        }
    }
}
