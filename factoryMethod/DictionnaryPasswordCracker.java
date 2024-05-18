import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Set;

abstract class DictionnaryPasswordCracker {
    public abstract String crack(String hash);
}

class DictionnaryLocalPasswordCracker extends DictionnaryPasswordCracker{
    private static HashMap<String, String> passwordHashMap = new HashMap<>();

    static {
        // Voici un dictionnaire de mots de passe courants et leurs hashes
        addPasswordHash("password", HashMD5.getMd5("password"));
        addPasswordHash("123456", HashMD5.getMd5("123456"));
        addPasswordHash("qwerty", HashMD5.getMd5("qwerty"));
        addPasswordHash("admin", HashMD5.getMd5("admin"));
        addPasswordHash("baa1", HashMD5.getMd5("baa1"));
        addPasswordHash("baba", HashMD5.getMd5("baba"));
        addPasswordHash("amar", HashMD5.getMd5("amar"));
        addPasswordHash("moha", HashMD5.getMd5("moha"));
        addPasswordHash("aba", HashMD5.getMd5("aba"));
    }

    private static void addPasswordHash(String password, String hash) {
        passwordHashMap.put(password, hash);
    }

    public String crack(String hash) {
        for (HashMap.Entry<String, String> password : passwordHashMap.entrySet()) {
            if (password.getValue().equals(hash)) {
                return "Le Mot de passe de votre hash ("+hash +") a ete trouvé dans le dictionnaire: \n ---->"+password.getKey();
            }
        }
        return "Le Mot de passe n'a pas ete trouve dans le dictionnaire";
    }
}

class DictionnaryOnlinePasswordCracker extends DictionnaryPasswordCracker{
    public String crack(String hash){
        return "passer";
    }
}

