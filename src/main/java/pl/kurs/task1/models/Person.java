package pl.kurs.task1.models;

public abstract class Person {
    private final String firstName;
    private final String lastName;
    private final String pesel;
    private String city;

    public Person(String firstName, String lastName, String pesel, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.city = city;
    }

    public abstract double getIncome();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }
}
