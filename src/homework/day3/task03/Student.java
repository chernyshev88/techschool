package homework.day3.task03;

public class Student {

    public Student(double averageMark) {
        this.averageMark = averageMark;
    }

    private String firstName, lastName, group;
    private double averageMark;

    public double getAverageMark() {
        return averageMark;
    }

    public int getScholarship() {
        return ((averageMark == 5) ? 100 : 80);
    }
}
