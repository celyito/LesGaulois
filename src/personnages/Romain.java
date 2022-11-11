package personnages;
import personnages.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement equipement [];
	private int nbEquipement = 0;
	public Romain(String nom, int force) {
		assert force>0 : "la force d’un Romain est toujours positive";
		this.nom = nom;
		this.force = force;
		equipement = new Equipement[2];
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
		assert forceCoup >= 0: "la force doit être positive!";
		int x = force;
		force -= forceCoup;
		assert force < x : "la force d’un Romain n'a pas diminué";
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		
	public int sEquiper (equipement, nbEquipement) {
		
		
		switch(nbEquipement) {
			case 1: 
				System.out.println("le soldat" + getNom()+ " est dejà bien protegé !");
			case 2:
				System.out.println("Le soldat" + getNom() + " possède déjà" + equipement + "!" );
			case 3:
				
			default:
				System.out.println("choix incorrect");
				break;
	}
	
	}
public static void main(String[] args) {
	Romain cesar = new Romain("cesar", 6);
	cesar.prendreParole1();
	cesar.parler("non, ne me frappe pas...");
	cesar.recevoirCoup(0);
	
	
}
}

