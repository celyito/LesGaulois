package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private int force1;
	private int nb_Trophees;
	private Equipement[] trophees = new Equipement[100];
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
//	public String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
//	public void frapper(Romain romain) {
//
//		System.out.println(nom + " envoie un grand coup dans la m�choire de "
//				+ romain.getNom());
//		romain.recevoirCoup((force / 3)* effetPotion);
//	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
				Equipement trophees[] = romain.recevoirCoup((force / 3) *
						effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
				nb_Trophees++) {
			this.trophees[nb_Trophees] = trophees[i];
		}
	}

	@Override
	public String toString() {

		return "Gaulois [nom=" + nom + ", force=" + force
				+  "]";
	}
	public void boirePotion(int forcePotion) {
		parler("Merci druide, je sens que ma force est " + forcePotion +  " fois d�cupl�e.");
	}
	




public static void main(String[] args) {

	Gaulois asterix = new Gaulois("Asterix", 3);
	asterix.boirePotion(3);

//	System.out.println(asterix);
//	System.out.println(asterix.nom);//afficher le nom de l'objet 
	
//	asterix.prendreParole();
//	asterix.parler("je vais te frapper...");
//	asterix.frapper(new Romain("cesar", 10));
	
	
	
	
	
}
}
