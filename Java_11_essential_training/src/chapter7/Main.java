package chapter7;

import chapter7.calc_helper;


import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        calc_helper calc = new calc_helper();
        var sc = new Scanner(System.in);

        double d1, d2;
        try {
            System.out.print("Enter a numeric value: ");
            d1 = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter a numeric value: ");
            d2 = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Couldn't format as a number");
            return;
        }

        System.out.print("Select an operation (+ - * /): ");
        var operation = sc.nextLine();

        double result;
        switch (operation) {
            case "+":
                result = calc.addVal(d1, d2);
                break;
            case "-":
                result = calc_helper.subVal(d1, d2);
                break;
            case "*":
                result = calc_helper.multVal(d1, d2);
                break;
            case "/":
                result = calc_helper.divideVal(d1, d2);
                break;
            default:
                System.out.println("You didn't choose a valid operation");
                return;
        }
        System.out.println("The answer is " + result);
    }
}
