package personnages;
import personnages.Chef;
import personnages.Gaulois;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois  Villageois [];
	private int nbVillageoisMaximum = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		Villageois =  new Gaulois[nbVillageois];
		this.nbVillageoisMaximum = nbVillageoisMaximum;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois, int i) {
			Villageois [i] = gaulois;
			nbVillageois++;
		
	}
	public Gaulois trouverHabitant(int i) {
		return Villageois[i];
	}
	
	public void afficherVillageois(){
		System.out.println("dans le village du chef" + chef.getNom()+ 
				" vivent les légendaires Gaulois : ");
		for (int i =1; i<nbVillageois;i++) {
			System.out.println("-" + Villageois[i].getNom());
		}
		
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		
//		Gaulois gaulois = village.trouverHabitant(30);
//		Unresolved compilation problem: 
//			Type mismatch: cannot convert from void to Gaulois
		
		Gaulois abraracourcix = new Gaulois("Abraracourcix",6);
		Chef chef = new Chef("Abraracourcix",6,village);
		village.setChef(chef);
		village.ajouterHabitant(abraracourcix, 0);
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix,1);
		
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			Type mismatch: cannot convert from void to Gaulois
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix, 2);
		village.afficherVillageois();
		

	}


}
