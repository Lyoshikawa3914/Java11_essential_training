package chapter6;

import java.util.Scanner;

public class debug_with_intelliJ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var i1 = getInput(sc, "Enter value 1: ");
        var i2 = getInput(sc, "Enter value 2: ");

        double result = addValues(i1, i2);
        System.out.print("The sum is " + result);
        System.out.println();

        double resultOfFour = addValues(i1, i2, i1, i2);
        System.out.print("The sum is " + resultOfFour);
        System.out.println();

        double resultOfMultiple = addValues(i1, i2, i1, i2, i1, i2);
        System.out.print("The sum is " + resultOfMultiple);
        System.out.println();
    }
    private static int getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    private static double addValues(int i1, int i2) {
        return i1 + i2;
    }

    private static double addValues(int i1, int i2, int i3, int i4) {
        return i1 + i2 + i3 + i4;
    }

    private static double addValues(int... values) {
        int result = 0;
        for (int value:values) {
            result += value;
        }
        return result;
    }
}
