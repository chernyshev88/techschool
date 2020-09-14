package homework.day3.task02;

public class Student {
    private String firstName, lastName, group;
    private double averageMark;

    public double getAverageMark() {
        return averageMark;
    }

    public int getScholarship(){
        return ((averageMark==5) ? 100 : 80);
    }
}
