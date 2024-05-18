class LocalPasswordCracker extends FabriquePasswordCracker{
    public BruteForcePasswordCracker creerBPC(){
        return new BruteForceLocalPasswordCracker();
    }
    public DictionnaryPasswordCracker creerDPC(){
        return new DictionnaryLocalPasswordCracker();
    }


}