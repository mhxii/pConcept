import java.io.File;

public class Main {

    public static void main(String[] args) {
        Dossier courant = new Dossier("");
        Tree.afficheTree(new File("."), courant);
        courant.afficher("");
    }
}
