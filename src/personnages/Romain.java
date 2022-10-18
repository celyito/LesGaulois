package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole1() + "� " + texte + "�");
	}
	public String prendreParole1() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
	}
public static void main(String[] args) {
//	Romain cesar = new Romain("cesar", 10);
//	cesar.prendreParole();
//	cesar.parler("non, ne me frappe pas...");
//	cesar.recevoirCoup(10);
	
	
}
}

