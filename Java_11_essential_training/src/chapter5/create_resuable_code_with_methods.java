package chapter5;

import java.util.Scanner;

public class create_resuable_code_with_methods {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double d1 = getinput(sc, "Enter a numeric value 1: ");

        double d2 = getinput(sc, "Enter a numeric value 2: ");

        double result = d1 / d2;
        System.out.println("The answer is " + result);
        
    }

    private static double getinput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }
}
