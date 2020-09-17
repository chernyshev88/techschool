package homework.day3.task02;

public class Main {
    public static void main(String[] args) {
        Animal[] animalsArray = {new Cat("Viskas", "House"),
                new Dog("Pedigree", "Yard"), new Horse("Grass", "Ranch")};
        Veterinarian veterinarian = new Veterinarian();
        for (Animal a : animalsArray) {
            veterinarian.reatAnimal(a);
        }
    }
}
