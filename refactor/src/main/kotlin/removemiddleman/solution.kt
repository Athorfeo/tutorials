package removemiddleman

/**
 * Solucion
  */

class Person {
    private Department department;

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department arg) {
        department = arg;
    }
}

class Department {
    private String chargeCode;
    private Person manager;

    public Department(Person arg) {
        manager = arg;
    }
    public Person getManager() {
        return manager;
    }

    //…
}

// Somewhere in client code
manager = john.getDepartment().getManager();