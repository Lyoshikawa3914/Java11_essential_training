package chapter5;

import java.util.Scanner;

public class practice_ch5 {

    public static void main(String[] args) {
        var scanner1 = new Scanner(System.in);
        System.out.print("How many dogs do you have?");

        Integer numDogs = scanner1.nextInt();
        var scanner2 = new Scanner(System.in);

        for (int i = 0; i < numDogs; i++) {
            System.out.print("Whats the dogs' name?");
            String nameDogs = scanner2.nextLine();
            System.out.println("Your dogs name is " + nameDogs);
            System.out.println();
        }

    }
}
