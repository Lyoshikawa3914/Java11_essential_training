import java.util.Scanner;

public class chapter4_challenge {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter a numeric val: ");
        var input1 = scanner.nextDouble();
        System.out.print("Enter a numeric val: ");
        var input2 = scanner.nextDouble();

        double result = input1/ input2;
        System.out.println("The answer is " + result);
    }
}
