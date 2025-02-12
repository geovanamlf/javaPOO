package ex00.application;

import java.util.Locale;
import java.util.Scanner;

import ex00.application.entities.Triangle;

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
        x = new Triangle(); //Instanciando o objeto
        y = new Triangle(); //Instanciando o objeto

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble(); //Guardando o sc no atributo a
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double  areaX = x.area(); //Chamada do metodo
        double areaY = y.area(); //Chamada do metodo

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Large area: X");
        } else {
            System.out.println("Large area: Y");
        }
    }
}
