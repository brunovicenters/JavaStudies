import math.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(10,3);

        System.out.println("Operations for "+c1.fNumber+" and "+c1.sNumber);
        System.out.println("Add: "+c1.add());
        System.out.println("Subtraction: "+c1.sub());
        System.out.println("Multiply: "+c1.mul());
        System.out.println("Divide: "+c1.div());
        System.out.println("Modulus: "+c1.mod());
        System.out.println("Power: "+c1.pow());
    }
}