import java.text.NumberFormat;
import java.util.Locale;

public class format_numeric_val_asString {

    public static void main(String[] args) {
        var doubleVal = 10_000_000.53;

        var numF = NumberFormat.getCompactNumberInstance();
        System.out.println("Number: " + numF.format(doubleVal));

        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Number: " + intF.format(doubleVal));

        intF.setGroupingUsed(false);
        System.out.println("Number: " + intF.format(doubleVal));



    }
}
