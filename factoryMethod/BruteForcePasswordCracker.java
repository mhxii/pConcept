abstract class BruteForcePasswordCracker {
    public abstract String crack(String hash);
}


class BruteForceLocalPasswordCracker extends BruteForcePasswordCracker{
    String CHARSET = "abcdefghijklmnopqrstuvwxyz0123456789";
    public String crack(String hash){
        System.out.println("[RECHERCHE PAR BRUTFORCE EN COURS...]");
        for (int length = 1; length <= hash.length(); length++) {
            for (int i = 0; i < Math.pow(CHARSET.length(), length); i++) {
                String password = Generateur.generatePassword(i, length,CHARSET);
                System.out.println(password);
                String passwordHash = HashMD5.getMd5(password);
                if (passwordHash.equals(hash)) {
                    return "Le Mot de passe de votre hash ("+hash +") a ete trouvé par brutforce: \n ---->"+password;
                }
            }
        }
        return "Mot de passe non trouvé dans le dictionnaire";
    }
}

class BruteForceOnlinePasswordCracker extends BruteForcePasswordCracker{
    public String crack(String hash){
        return "passer";
    }
}
