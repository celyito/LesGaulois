package personnages;
import java.util.Random;
import personnages.Gaulois;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public int preparerPotion(int forcePotion) {
//		Random objet= new Random();
//		int force = effetPotionMin+objet.nextInt(effetPotionMax-effetPotionMin);
		
		if (forcePotion >7) {
			parler(" J'ai préparé une super potion de force " + forcePotion);
		} 
		else {
			parler("Je n'ai pas trouvé tous les ingredients, ma potion est seulement de force" + forcePotion);
		}
		
		return forcePotion;
	}
	public void booster(Druide gaulois) {
		if (nom == "Obelix"){
			System.out.println(nom);
		}
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
//		panoramix.preparerPotion();
		Gaulois obelix = new Gaulois("obelix", 10);
		panoramix.booster(obelix);
	}

}

