package scénario;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		asterix.prendreParole();
		asterix.parler("Bonjour à tous");
		minus.prendreParole1();
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		
		
		

	}

}
