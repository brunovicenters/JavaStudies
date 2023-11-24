package shop;

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

    public Buy(int priceByInstallment, int numberInstallments) {
        this.totalPrice = priceByInstallment * numberInstallments;
        this.numberInstallments = numberInstallments;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getNumberInstallments() {
        return numberInstallments;
    }

    public int getPriceByInstallments() {
        return totalPrice/numberInstallments;
    }
}
