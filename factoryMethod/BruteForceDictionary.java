import java.util.ArrayList;
import java.util.List;

public class BruteForceDictionary {
    public static void main(String[] args) {
        String password = bruteForce("LRH");
        System.out.println(password);
    }

    public static String bruteForce(String pass) {
        List<String> dictionary = generateDictionary();
        for (String word : dictionary) {
            if (word.equalsIgnoreCase(pass)) {
                return word;
            }
        }
        return "";
    }

    private static List<String> generateDictionary() {
        List<String> dictionary = new ArrayList<>();

        
        dictionary.add("AAA");
        dictionary.add("AAB");
        dictionary.add("AAC");
        dictionary.add("AAD");
        

        return dictionary;
    }
}
