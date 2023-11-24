import shop.Buy;

public class Main {
    public static void main(String[] args) {
        Buy bcash = new Buy(500);

        System.out.println("Price by installment: "+bcash.getTotalPrice());
        System.out.println("Quantity of installments: "+bcash.getNumberInstallments());
        System.out.println("Total price: "+bcash.getPriceByInstallments());

        System.out.println("*******************************************************");
        Buy bInst = new Buy(100,3);

        System.out.println("Price by installment: "+bInst.getTotalPrice());
        System.out.println("Quantity of installments: "+bInst.getNumberInstallments());
        System.out.println("Total price: "+bInst.getPriceByInstallments());



    }
}