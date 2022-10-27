package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		assert force>0 : "la force d’un Romain est toujours positive";
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole1() + "« " + texte + "»");
	}
	public String prendreParole1() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
public static void main(String[] args) {
	Romain cesar = new Romain("cesar", 6);
	cesar.prendreParole1();
	cesar.parler("non, ne me frappe pas...");
	cesar.recevoirCoup(6);
	
	
}
}

