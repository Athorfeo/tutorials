package extractvariable

/**
 * Solucion
  */

double price() {
    final double basePrice = quantity * itemPrice;
    final double quantityDiscount = Math.max(0, quantity - 500) * itemPrice * 0.05;
    final double shipping = Math.min(basePrice * 0.1, 100.0);
    return basePrice - quantityDiscount + shipping;
}