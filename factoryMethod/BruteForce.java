import java.util.Arrays;

public class BruteForce {
    public static void main(String[] args) {
        String password = bruteForce(3, "ARY");
        System.out.println(password);
    }

    public static String bruteForce(int size, String pass) {
        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] password = new char[size];
        Arrays.fill(password, charset.charAt(0));
        return computePermutations(size, password, charset, pass);
    }

    private static String computePermutations(int size, char[] password, String charset, String pass) {
        String currentPassword = new String(password);
        System.out.println(currentPassword);

        if (currentPassword.equalsIgnoreCase(pass)) {
            return currentPassword;
        }

        for (int i = size - 1; i >= 0; i--) {
            int index = charset.indexOf(password[i]);
            if (index < charset.length() - 1) {
                password[i] = charset.charAt(index + 1);
                break;
            } else {
                password[i] = charset.charAt(0);
            }
        }

        return computePermutations(size, password, charset, pass);
    }
}
