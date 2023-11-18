package basics;

public class Strings {

    public static void main(String[] args) {
        // *************************************************************************************************************

        //                                                               STRINGS

        // *************************************************************************************************************

        String greeting = "Hello, Vicente!";

        System.out.println("\nString Length --->");
        System.out.println("'" + greeting + "' has " + greeting.length() + " characters.");

        // *************************************************************************************************************

        System.out.println("\nString to Upper Case --->");
        System.out.println(greeting.toUpperCase());

        // *************************************************************************************************************

        System.out.println("\nString to Lower Case --->");
        System.out.println(greeting.toLowerCase());

        // *************************************************************************************************************

        System.out.println("\nString Index --->");
        System.out.println("The fourth letter is " + greeting.charAt(4));

        System.out.println("\nString Specific Character/Word Index --->");
        System.out.println("The letter 'V' is at index " + greeting.indexOf("V"));

        // *************************************************************************************************************

    }
}
