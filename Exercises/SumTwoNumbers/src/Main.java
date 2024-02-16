import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write first number:");
        int number1 = scanner.nextInt();
        System.out.print("Write second number:");
        int number2 = scanner.nextInt();

        scanner.close();;

        int result = sumNumbers(number1, number2);

        System.out.println("The result is:");
        System.out.println(result);
    }

    public static int sumNumbers(int n1, int n2){
        return n1+n2;
    }
}