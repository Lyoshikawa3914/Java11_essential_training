public class convert_primitive_values_to_string {
    public static void main(String[] args) {
        int result = 10 + 12;
        String answer = "The answer is " + result;
        System.out.println(answer);;

        String howMany = 20 + " things";
        System.out.println(howMany);

        int intValue = 42;
        var fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolVal = true;
        var fromBool = Boolean.toString(boolVal);
        System.out.println(fromBool);

        long longVal = 10_000_000;
        var stringLong = Long.toString(longVal);
        System.out.println(stringLong);
    }
}
