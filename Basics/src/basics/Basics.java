// Create package
package basics;

//Create class
public class Basics {
    // Create method
    public static void main(String[] args) throws Exception {
        // Print in screen
        System.out.println("Hello, World!");
        System.out.println("Let's learn some Java");

        // *************************************************************************************************************

        //                                                   DECLARING VARIABLES

         // *************************************************************************************************************
         
        System.out.println("\nStrings:");

        // Declare String variables
        String name = "Vicente";

        System.out.println(name + " is learning Java");

         // *************************************************************************************************************

        System.out.println("\nIntegers:");

        // Declare int variables (only positive or negative numbers)
        int int1 = 2;
        int int2 = 4;

        int intSum = int1+int2;
        System.out.println("2 + 4 = " + intSum);

        // *************************************************************************************************************

        System.out.println("\nFloats:");

        // Declare float variables (accept decimal numbers)
        float float1 = 2.5f;
        float float2 = 4.5f;

        float floatSum = float1+float2;
        System.out.println(float1 + " + " + float2 + " = " + (floatSum));

        // *************************************************************************************************************

        System.out.println("\nDoubles:");

        // Declare double variables (accept decimal numbers, but with more precision)
        double double1 = 2.5;
        double double2 = 4.5;

        double doubleSum = double1+double2;
        System.out.println(double1 + " + " + double2 + " = " + (doubleSum));

        // *************************************************************************************************************

        System.out.println("\nBooleans:");

        // Declare boolean variables

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1);
        System.out.println(bool2);

        // *************************************************************************************************************

        System.out.println("\nCharacters:");

        // Declare char variables

        char char1 = 'a';
        char char2 = 'B';

        System.out.println("You declare a character, like: " + char1 + " or " + char2);

        // *************************************************************************************************************

        System.out.println("\nConstants:");

        // You can also define constants

        double PIChange = 3.1415;
        final double PI = 3.1415; // Constant

        System.out.print(PIChange + " before change, and then ");
        PIChange = PIChange + 3;
        System.out.println( PIChange + " after change");
        System.out.println(PI + " before change, and you get an error if you try to change");

        // *************************************************************************************************************

        System.out.println("\nVariables list:");

        // You can declare multiple variables at the same time

        int a = 2, b = 4, c = 6;

        System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));

    }
}
