import java.util.*;

public class PasswordChecker {
    public static void main(String[] args) {
        String password = "YourPassword1#";

        if (isValidPassword(password)) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is not valid.");
        }
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasInt = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        boolean hasSpace = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasInt = true;
            } else if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (ch == ' ') {
                hasSpace = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }

        return hasInt && hasUppercase && hasLowercase && hasSpecialChar && !hasSpace;
    }
}