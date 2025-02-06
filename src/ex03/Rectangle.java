package ex03;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
       return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public void showInfo() {
        System.out.printf("AREA = %.2f", + area());
        System.out.println("");
        System.out.printf("PERIMETER = %.2f", + perimeter());
        System.out.println("");
        System.out.printf("DIAGONAL = %.2f", + diagonal());
    }
}
