package pl.kurs.task2;

import java.util.Objects;

public class Kwadrat extends Figura{
    private final int a;
    private int number;

    public Kwadrat(int a) {
        this.a = a;
    }

    public Kwadrat(int a, int number) {
        this.a = a;
        this.number = number;
        Figura.number++;
    }
    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }
    @Override
    public double calculateArea() {
        return a * a;
    }
    @Override
    public String toString() {
        return "Figura nr " + number + ": " + getClass().getSimpleName() + " o boku " + a + ".";
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Kwadrat kwadrat = (Kwadrat) object;
        return a == kwadrat.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
