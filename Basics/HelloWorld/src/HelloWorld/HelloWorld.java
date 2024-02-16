package HelloWorld;

public class HelloWorld {
    String firstString = "hello";

    String secondString = "world";

    public int numb;

    public HelloWorld(int num) {
        numb = num;
    }

    public void hello(){
        System.out.println(firstString + " " + secondString);
        System.out.println("let's conquer the world");
    }

    public String isEven() {
        String result;

        if (numb % 2 != 0) {
            result = "Is odd";
        } else {
            result = "Is even";
        }

        return result;
    }

}
