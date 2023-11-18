package basics;

public class Numbers {
    public static void main(String[] args) {
        // *************************************************************************************************************

        //                                                  CONVERTING VARIABLES

        // *************************************************************************************************************

        System.out.println("\nConverting Variables --->");

        // Widening casting (smaller to bigger size)
        // byte -> short -> int -> long -> float -> double

        int myInt1 = 5;
        double myDouble1 = myInt1;

        System.out.println("Integer: " + myInt1 + "\nDouble: " + myDouble1);

        // *************************************************************************************************************


        // Narrowing casting (bigger to smaller size)
        // double -> float -> long -> int -> short -> byte

        double myDouble2 = 5.5;
        int myInt2 = (int) myDouble2;

        System.out.println("\nDouble: " + myDouble2 + "\nInteger: " + myInt2);

        // *************************************************************************************************************

        //                                                             OPERATORS

        // *************************************************************************************************************

        int numb1 = 10;
        int numb2 = 5;

        System.out.println("\nMath Operators --->");

        System.out.println("Addition: " + (numb1 + numb2));
        System.out.println("Subtraction: " + (numb1 - numb2));
        System.out.println("Multiplication: " + (numb1 * numb2));
        System.out.println("Division: " + (numb1 / numb2));
        System.out.println("Modulus: " + (numb1 % numb2));
        System.out.println("Increment: " + ++numb1);
        System.out.println("Decrement: " + --numb2);

        // *************************************************************************************************************

        int numb3 = 10;

        System.out.println("\nAssignment Operators --->");

        numb3 += 10;
        System.out.println("Addition Assignment: " + numb3);
        numb3 -= 5;
        System.out.println("Subtraction Assignment: " + numb3);

        // *************************************************************************************************************

        int numb4 = 10;

        System.out.println("\nComparison Operators --->");

        System.out.println("The number " + numb4 + " is: ");
        System.out.println("Equals to 10 => " + (numb4 == 10));
        System.out.println("Not Equals to 10 => " + (numb4 != 10));
        System.out.println("Greater than 6 => " + (numb4 > 6));
        System.out.println("Less than 6 => " + (numb4 < 6));
        System.out.println("Greater than or equals to 9 => " + (numb4 >= 9));
        System.out.println("Less than or equals to 10 => " + (numb4 <= 10));
        
        // *************************************************************************************************************

        int numb5 = 10;

        System.out.println("\nLogical Operators --->");

        System.out.println("The number " + numb5 + " is: ");
        System.out.println("Equals to 10 AND greater than 6 => " + (numb5 == 10 && numb5 > 6));
        System.out.println("Equals to 10 OR greater than 20 => " + (numb5 == 10 || numb5 > 20));
        System.out.println("Not equals to 10 OR greater than 20 => " + !(numb5 == 10 || numb5 > 20));

    }
}
