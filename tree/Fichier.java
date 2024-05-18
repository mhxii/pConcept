public class Fichier extends Composant
{
	private String nom;

	public Fichier(String nom)
	{
		this.nom = nom;
	}

	public String getNom()
	{
		return nom;
	}


	public void setNom(String nom)
	{
		this.nom = nom;
	}


	@Override
	public void afficher(String decalage) {
		System.out.println(decalage+"|___" + nom);
	}
}