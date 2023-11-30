package school;

public class Student {
    public int FirstBim;
    public int SecondBim;
    public int ThirdBim;
    public int FourthBim;

    public int gradeAverage(){
        int total = 0;
        total += this.FirstBim;
        total += this.SecondBim;
        total += this.ThirdBim;
        total += this.FourthBim;

        return total/4;
    }

    public boolean passedYear(){
        return gradeAverage() >= 60;
    }

}
