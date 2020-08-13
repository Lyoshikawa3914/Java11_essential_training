import java.util.Scanner;

public class evaluate_condition_if_else {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        var monthNum = scanner.nextInt();

        String message;
        if(monthNum < 1 || monthNum > 12) {
            message = "That isn't a valid month";
        }
        else if(monthNum <= 3) {
            message = "That's in quarter 1";
        }
        else if(monthNum <= 6) {
            message = "That's in quarter 2";
        }
        else {
            message = "That isnt in the first half of the year";
        }
        System.out.println(message);
    }
}
