package chapter6;

public class handle_excpetions_with_trycatch {
    public static void main(String[] args) {

        String s = null;
        try {
            var sub = s.substring(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("im not dead yet");
    }
}
