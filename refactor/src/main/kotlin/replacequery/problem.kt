package replacequery

/**
 * Problema
  */

class Product {
    // ...
    public double getPrice() {
        int basePrice = quantity * itemPrice;
        double discountFactor;
        if (basePrice > 1000) {
            discountFactor = 0.95;
        }
        else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
}