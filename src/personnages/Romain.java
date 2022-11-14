package personnages;
import personnages.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];;
	private int nbEquipement = 0;
	public Romain(String nom, int force) {
		
		this.nom = nom;
		this.force = force;
		
	}
	public int getForce() {
		return force;
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
//	public void recevoirCoup(int forceCoup) {
//		assert forceCoup >= 0: "la force doit être positive!";
//		int x = force;
//		force -= forceCoup;
//		assert force < x : "la force d�un Romain n'a pas diminu�";
//		if (force > 0) {
//			parler("Aïe");
//		} else {
//			parler("J'abandonne...");
//		}
//	}
		
	public void sEquiper ( Equipement equipement) {
		
		
		switch(nbEquipement) {
		case 0: 
			System.out.println("le soldat s'équipe avec un" + Equipement.BOUCLIER );
		case 1:
			System.out.println("Le soldat" + getNom() + " possède dejà" + equipement + "!" );
		case 2:
			System.out.println("le soldat" + getNom()+ " est deja bien protegé !");
		default:
			System.out.println("choix incorrect");
			break;
		}
	
		
	}
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force > 0) {
		 parler("Aïe");
		 } else {
		 equipementEjecte = ejecterEquipement();
		 parler("J'abandonne...");
		 }
		
			// post condition la force a diminuée
			assert force < oldForce;
			return equipementEjecte;
			}
	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
				int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\n Mais heureusement, grace à mon équipement sa force est diminué de ";
					for (int i = 0; i < nbEquipement;) {
						if ((equipement[i] != null &&
								equipement[i].equals(Equipement.BOUCLIER)) == true) {
							resistanceEquipement += 8;
						} else {
							System.out.println("Equipement casque");
							resistanceEquipement += 5;
						}
						i++;
					}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
				int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipement[i] == null) {
			} else {
				equipementEjecte[nbEquipementEjecte] =
						equipement[i];
				nbEquipementEjecte++;
				equipement[i] = null;
			}
		}
		return equipementEjecte;

		}

public static void main(String[] args) {
	Romain cesar = new Romain("cesar", 6);
	cesar.prendreParole1();
	cesar.parler("non, ne me frappe pas...");
	cesar.recevoirCoup(0);
	
}
}

