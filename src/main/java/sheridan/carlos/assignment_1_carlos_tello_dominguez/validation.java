package sheridan.carlos.assignment_1_carlos_tello_dominguez;

public class validation {

    public static String validate(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "Please enter at least 1 character.";
        }
        if (input.trim().length() > 10) {
            return "Please enter no more than 10 characters.";
        }
        return null;
    }
}
