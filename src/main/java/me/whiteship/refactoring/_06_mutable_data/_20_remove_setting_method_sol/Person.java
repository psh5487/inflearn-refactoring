package me.whiteship.refactoring._06_mutable_data._20_remove_setting_method_sol;

public class Person {

    private String name;

    private int id;

    // Generate 단축키: cmd + n
    public Person(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
