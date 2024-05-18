import java.io.File;

public class Tree {
    public static void afficheTree(File file, Dossier parent) {
        if (file.isDirectory()) {
            Dossier Dossier = new Dossier(file.getName());
            if (parent != null) {
                parent.ajouter(Dossier);
            }
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    afficheTree(f, Dossier);
                }
            }
        } else {
            Fichier fichier = new Fichier(file.getName());
            parent.ajouter(fichier);
        }
    }
}
