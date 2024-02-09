import sum.Sum;

public class Main {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        s1.name = "First Sum";
        Sum s2 = new Sum();
        s2.name = "Second Sum";
        Sum s3 = new Sum();
        s3.name = "Third Sum";

        for (int i = 0;i<4;i++) {
            s1.sum();
            s2.sum();
            s3.sum();
        }

        s1.sum();
        s3.sum();
        s3.sum();

        s1.print();
        s2.print();
        s3.print();
    }
}