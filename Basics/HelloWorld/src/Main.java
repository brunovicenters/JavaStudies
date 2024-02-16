import HelloWorld.HelloWorld;

public class Main {
    public static void main(String[] args) {
        HelloWorld var = new HelloWorld(2);

        var.hello();

        System.out.println(var.isEven());
    }
}