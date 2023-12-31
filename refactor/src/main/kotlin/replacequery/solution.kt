package replacequery

/**
 * Solucion
  */

class Product {
    // ...
    public double getPrice() {
        return basePrice() * discountFactor();
    }
    private int basePrice() {
        return quantity * itemPrice;
    }
    private double discountFactor() {
        if (basePrice() > 1000) {
            return 0.95;
        }
        else {
            return 0.98;
        }
    }
}