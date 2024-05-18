abstract class FabriquePasswordCracker {
    public abstract BruteForcePasswordCracker creerBPC();
    public abstract DictionnaryPasswordCracker creerDPC();

    public static FabriquePasswordCracker getInstance(String[] args){
        switch (args.length) {
            case 1:
                return new LocalPasswordCracker();
            case 2:
                return new OnlinePasswordCracker();
            default:
                throw new IllegalArgumentException("Type de craquage de mot de passe non pris en charge");
        }
    }
}


