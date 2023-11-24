package shop;// Organize your classes in packages --

// Create Class --
    public class Buy {
        // Set its attributes --
        int totalPrice;
        int numberInstallments;

        // shop.Buy in cash --
        public Buy(int price){
            totalPrice = price;
            numberInstallments = 1;
        }

        // shop.Buy in installments --
        public Buy (int qtyInstallments, int pricePerInstallment){
            numberInstallments = qtyInstallments;
            totalPrice = pricePerInstallment * qtyInstallments;
        }

        public int getTotalPrice(){
            return totalPrice;
        }

        public int getNumberInstallments(){
            return numberInstallments;
        }

        public int getPriceByInstallment(){
            return totalPrice/numberInstallments;
        }
}
