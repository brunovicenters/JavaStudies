import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write first grade:");
        int grade1 = scanner.nextInt();
        System.out.print("Write second grade:");
        int grade2 = scanner.nextInt();
        System.out.print("Write third grade:");
        int grade3 = scanner.nextInt();

        scanner.close();;

        int result = avgGrade(grade1, grade2, grade3);

        System.out.println("The average is:");
        System.out.println(result);
    }

    public static int avgGrade(int g1, int g2, int g3){
        return (g1+g2+g3)/3;
    }
}