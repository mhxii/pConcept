public class Generateur {
    public static String generatePassword(int index, int length,String CHARSET) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int charIndex = index % CHARSET.length();
            sb.append(CHARSET.charAt(charIndex));
            index /= CHARSET.length();
        }
        return sb.toString();
    }
}
