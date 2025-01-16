package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

    public static void main(String[] args) {
        /*
        Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
        válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
        possui a maior área.
        A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
        seguinte (fórmula de Heron):

        area = raiz quadrada p(p - a)(p - b)(p - c) onde    p = a + b + c
                                                                ---------
                                                                    2
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle X area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Large area: X");
        } else {
            System.out.println("Large area: Y");
        }
    }
}
