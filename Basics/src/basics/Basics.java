// Create package
package basics;

//Create class
public class Basics {
    // Create method
    public static void main(String[] args) throws Exception {
        // Print in screen
        System.out.println("Hello, World!");
        System.out.println("Let's learn some Java");

        // Declare int variables
        int num1 = 2;
        int num2 = 4;
        // Add
        int resultSum = num1+num2;
        // Subtract
        int resultSub = num2-num1;
        // Multiply
        int resultMul = num1*num2;
        // Divide
        int resultDiv = num2/num1;
        // Modulos
        int resultMod = num2%num1;
        System.out.println("2 + 4 = " + resultSum);
        System.out.println("4 - 2 = " + resultSub);
        System.out.println("2 x 4 = " + resultMul);
        System.out.println("4 / 2 = " + resultDiv);
        System.out.println("4 % 2 = " + resultMod);
    }
}
