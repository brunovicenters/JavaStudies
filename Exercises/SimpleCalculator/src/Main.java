import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write first number:");
        float n1 = scanner.nextFloat();
        System.out.print("Write second number:");
        float n2 = scanner.nextFloat();

        scanner.close();

        System.out.println(sum(n1, n2));
        System.out.println(sub(n1, n2));
        System.out.println(div(n1, n2));
        System.out.println(mul(n1, n2));
    }

    private static float sum(float n1, float n2){
        return n1+n2;
    }

    private static float sub(float n1, float n2){
        return n1-n2;
    }

    private static float div(float n1, float n2){
        return n1/n2;
    }

    private static float mul(float n1, float n2){
        return n1*n2;
    }
}