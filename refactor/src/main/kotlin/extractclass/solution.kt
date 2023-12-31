package extractclass

/**
 * Solucion
  */

class Person {
    private String name;
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public String getName() {
        return name;
    }
    public TelephoneNumber getOfficeTelephone() {
        return officeTelephone;
    }
    public String getTelephoneNumber() {
        return officeTelephone.getTelephoneNumber();
    }
}

class TelephoneNumber {
    private String areaCode;
    private String number;

    public String getAreaCode() {
        return areaCode;
    }
    public void setAreaCode(String arg) {
        areaCode = arg;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String arg) {
        number = arg;
    }
    public String getTelephoneNumber() {
        return ("(" + areaCode + ") " + number);
    }
}