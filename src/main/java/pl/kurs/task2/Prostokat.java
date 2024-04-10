package pl.kurs.task2;

import java.util.Objects;

public class Prostokat extends Figura{
    private final int a;
    private final int b;
    private int number;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Prostokat(int a, int b, int number) {
        this.a = a;
        this.b = b;
        this.number = number;
        Figura.number++;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (a + b);
    }
    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Figura nr " + number + ": " + getClass().getSimpleName() + " o boku " + a + "x" + b + ".";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Prostokat prostokat = (Prostokat) object;
        return a == prostokat.a && b == prostokat.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
