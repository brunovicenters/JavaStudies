import school.Student;

public class Main {
    public static void main(String[] args) {
        Student vicente = new Student();
        vicente.FirstBim = 70;
        vicente.SecondBim = 90;
        vicente.ThirdBim = 60;
        vicente.FourthBim = 80;

        System.out.println(vicente.gradeAverage());
        System.out.println(vicente.passedYear());
    }
}