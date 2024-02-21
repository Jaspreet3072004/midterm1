/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jaspreetexercise2.mavenproject1;
       

import java.util.Scanner;


/**
 *
 * @author New user
 */
public class Mavenproject1 {

    

    /**
     *
     */

    /**
     *
     */
    public enum Operation {
        PLUS {
            @Override
            public double apply(double x, double y) { return x + y; }
        },
        MINUS {
            @Override
            public double apply(double x, double y) { return x - y; }
        },
        TIMES {
            @Override
            public double apply(double x, double y) { return x * y; }
        },
        DIVIDES {
            @Override
            public double apply(double x, double y) { return x / y; }
        };

        public abstract double apply(double x, double y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operation (PLUS, MINUS, TIMES, DIVIDES): ");
        Operation operation = Operation.valueOf(scanner.next().toUpperCase());

        double result = operation.apply(num1, num2);
        System.out.println("Result: " + result);
    }
}

    
