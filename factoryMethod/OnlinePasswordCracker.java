class OnlinePasswordCracker extends FabriquePasswordCracker{
    public BruteForcePasswordCracker creerBPC(){
        return new BruteForceOnlinePasswordCracker();
    }
    public DictionnaryPasswordCracker creerDPC(){
        return new DictionnaryOnlinePasswordCracker();
    }


}