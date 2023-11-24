package shop;// Organize your classes in packages --

// Create Class --
public class Main {
    public static void main(String[] args) {
        Buy bCash = new Buy(500);

        bCash.getTotalPrice();
        bCash.getNumberInstallments();
        //System.out.println(bCash.totalPrice + " " + bCash.numberInstallments);

    }
}