package histoire;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;

public class Scenario {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix",6);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller préparer une petite potion...");   
		panoramix.preparerPotion(6);                                       
		panoramix.booster(obelix);                                         
		obelix.parler("Par Bélénos, ce n'est pas juste!");                 
		asterix.boirePotion(6);                                            
		asterix.parler("Bonjour");                                         
		asterix.prendreParole();
		asterix.parler("Bonjour à tous");
		minus.prendreParole1();
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		
		
		
		

		
		

		
		
		
		

	}

}
