package extractmethod

/**
 * Solucion
  */

void printOwing() {
    printBanner();
    double outstanding = getOutstanding();
    printDetails(outstanding);
}

void printBanner() {
    System.out.println("*****************************");
    System.out.println("****** Customer totals ******");
    System.out.println("*****************************");
}

void printDetails(double outstanding) {
    System.out.println("name: " + name);
    System.out.println("amount: " + outstanding);
}

double getOutstanding() {
    Enumeration elements = orders.elements();
    double outstanding = 0.0;
    while (elements.hasMoreElements()) {
        Order each = (Order) elements.nextElement();
        outstanding += each.getAmount();
    }
    return outstanding;
}