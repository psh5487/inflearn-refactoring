package me.whiteship.refactoring._10_data_clumps.sol;

public class Employee {

    private String name;

    private TelephoneNumber employeePhoneNumber;

    public Employee(String name, TelephoneNumber employeePhoneNumber) {
        this.name = name;
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TelephoneNumber getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }
}
