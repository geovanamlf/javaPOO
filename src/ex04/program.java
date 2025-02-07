package ex04;

import java.util.Scanner;
import java.util.Locale;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();

        System.out.println("Enter the employee's name: ");
        employee.name = sc.nextLine();

        System.out.println("Enter the employee's gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Enter the employee's tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: " + employee.name + ", " + "$ %.2f\n", employee.netSalary());
        System.out.println();

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee.name + "," + " $ " + employee);

    }
}
