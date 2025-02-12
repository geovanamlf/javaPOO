package ex00.application.entities;

public class Triangle {

    public double a; // Atributo
    public double b; // Atributo
    public double c; // Atributo

    public double area() {
        double p = (a + b +c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

