package pl.kurs.task1.models;

public class Student extends Person {
    private String group;
    private double scholarship;

    public Student(String firstName, String lastName, String pesel, String city, String group, double scholarship) {
        super(firstName, lastName, pesel, city);
        this.group = group;
        this.scholarship = scholarship;
    }

    public double getIncome() {
        return scholarship;
    }
}
