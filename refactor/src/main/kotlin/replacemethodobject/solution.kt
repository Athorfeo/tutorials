package replacemethodobject

/**
 * Solucion
  */

class Account {
    // ...
    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }
}
class Gamma {
    private final Account account;
    private int importantValue1, importantValue2, importantValue2;
    private int inputVal, quantity, yearToDate;
    public Gamma(Account source, int inputValArg, int quantityArg, int yearToDateArg) {
        this.account = source;
        //...
    }
    public int compute() {
        importantValue1 = (inputVal * quantity) + account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;
        importantThing();
        importantValue3 = importantValue2 * 7;
        // and so on…
        return importantValue3 - 2 * importantValue1;
    }
    void importantThing() {
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
    }
}