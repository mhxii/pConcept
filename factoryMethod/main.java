import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc=new Scanner(System.in);
        FabriquePasswordCracker PasswordCracker = FabriquePasswordCracker.getInstance(args);
        DictionnaryPasswordCracker dictionnaryPasswordCracker=PasswordCracker.creerDPC();
        BruteForcePasswordCracker bruteForcePasswordCracker =PasswordCracker.creerBPC();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println(dictionnaryPasswordCracker.crack(args[0]));
        System.out.println("Appuyez sur la touche (ENTRER) pour la recherche par BRUTFORCE");
        sc.nextLine();
        System.out.println(bruteForcePasswordCracker.crack(args[0]));
        System.out.println("Appuyez sur la touche (ENTRER) pour FERMER");
                    sc.nextLine();
    }
}


