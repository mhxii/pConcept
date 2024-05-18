import java.util.ArrayList;

public class Dossier extends Composant
{
	private String nom;
	private ArrayList<Composant> elements;

	public Dossier(String nom) {
		this.nom = nom;
		this.elements = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Composant> getElements() {
		return elements;
	}

	@Override
	public void ajouter(Composant element) {
		this.elements.add(element);
	}

	@Override
	public void supprimer(Composant element) {
		this.elements.remove(element);
	}

	@Override
	public void afficher(String decalage) {
        System.out.println(decalage + nom + "");
        for (Composant composant : elements) {
            composant.afficher(decalage + "    ");
			
        }
    }
}
