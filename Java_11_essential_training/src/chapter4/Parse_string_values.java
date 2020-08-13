public class Parse_string_values {

    public static void main (String[] args) {
        var s1 = "Welcome to California!";
        System.out.println(s1.length());

        int pos = s1.indexOf("California");
        System.out.println(pos);

        // to find what word is in a certain position
        var sub = s1.substring(11);
        System.out.println(sub);

        // can trim down whitespace from a string
        String s2 = "Welcome      ";
        var trimmed = s2.trim();
        System.out.println(trimmed.length());
    }
}
