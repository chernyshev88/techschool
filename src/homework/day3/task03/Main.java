package homework.day3.task03;

public class Main {
    public static void main(String[] args) {
        Student student = new Aspirant(5.0);
        Student[] studenArray = {new Student(2.0), new Student(5.0), new Aspirant(4.0),
                new Aspirant(5.0)};
        for (Student s : studenArray) {
            System.out.println(s.getScholarship());
        }
    }
}

