package shop;// Organize your classes in packages --

// Create Class --
public class Buy {
    private final int totalPrice;
    private final int numberInstallments;

    public Buy() {
        this.totalPrice = 0;
        this.numberInstallments = 0;
    }

    public Buy(int totalPrice) {
        this.totalPrice = totalPrice;
        this.numberInstallments = 1;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getNumberInstallments() {
        return numberInstallments;
    }

}

