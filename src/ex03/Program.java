package ex03;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();

        System.out.println("Type the rectangle width: ");
        rectangle.width = sc.nextDouble();

        System.out.println("Type the rectangle height: ");
        rectangle.height = sc.nextDouble();

        rectangle.showInfo();

    }
}
