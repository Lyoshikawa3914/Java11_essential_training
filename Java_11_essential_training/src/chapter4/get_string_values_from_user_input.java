import java.util.Scanner;

public class get_string_values_from_user_input {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter a value:");
        var input = scanner.nextLine();
        System.out.println(input);

        System.out.print("Enter a number:");
        var num1 = scanner.nextInt();
        System.out.println(num1);
    }
}
