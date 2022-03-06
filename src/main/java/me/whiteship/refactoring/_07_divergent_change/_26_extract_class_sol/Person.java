package me.whiteship.refactoring._07_divergent_change._26_extract_class_sol;

public class Person {
    private String name;
    private TelephoneNumber telephoneNumber;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String telephoneNumber() {
        return this.telephoneNumber.toString();
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }
}
