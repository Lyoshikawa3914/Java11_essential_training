import java.time.LocalDateTime;

public class evaluate_conditions_with_switch_case {

    public static void main(String[] args) {

        var now = LocalDateTime.now();
        var monthNum = now.getMonthValue();

        switch (monthNum) {
            case 1:
                System.out.println("The month is January");
                break;
            case 2:
                System.out.println("The month is Februay");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Its the 4th quarter");
                break;
            default:
                System.out.println("You chose another month");

        }
    }
}
