package pl.kurs.task1.models;

public class Employee extends Person {
    private String jobPosition;
    private double salary;

    public Employee(String firstName, String lastName, String pesel, String city, String jobPosition, double salary) {
        super(firstName, lastName, pesel, city);
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    public double getIncome() {
        return salary;
    }
}
