package pl.kurs.task2;

import java.util.Objects;

public class Kolo extends Figura{
    private final int d;
    private int number;

    public Kolo(int d) {
        this.d = d;
    }

    public Kolo(int d, int number) {
        this.d = d;
        this.number = number;
        Figura.number++;
    }
    @Override
    public double calculatePerimeter() {
        return d * Math.PI;
    }

    @Override
    public double calculateArea() {
        return Math.PI *( d * d) / 4;
    }

    @Override
    public String toString() {
        return "Figura nr " + number + ": " + getClass().getSimpleName() + " o promieniu " + d / 2 + ".";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Kolo kolo = (Kolo) object;
        return d == kolo.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(d);
    }
}
