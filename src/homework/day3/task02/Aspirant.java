package homework.day3.task02;

public class Aspirant extends Student {
    public Aspirant(double averageMark) {
        super(averageMark);
    }

    @Override
    public int getScholarship() {
        return ((this.getAverageMark() == 5) ? 200 : 180);
    }
}
