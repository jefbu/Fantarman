package main.entity.armies;

import main.entity.captains.Captain;
import main.entity.regiments.terquits.Arbalesters;
import main.entity.regiments.terquits.Kinshiwang;
import main.entity.regiments.terquits.PebbleHurlers;

public class TerribleTerquits extends Army {

	private static final long serialVersionUID = 1L;

	public TerribleTerquits() {
		
		super();
		name = "Terrible Terquits";
		
		roster.add(new Kinshiwang("Lacquered Doom", Captain.boris));
		roster.add(new Kinshiwang("Clay Guards", Captain.boris));
		roster.add(new Kinshiwang("Earthen Vigil", Captain.boris));
		roster.add(new Kinshiwang("Massive Soil", Captain.boris));
		roster.add(new PebbleHurlers("Stone Debris", Captain.boris));
		roster.add(new PebbleHurlers("Diamond Jets", Captain.boris));
		roster.add(new Arbalesters("Pearl Arrows", Captain.boris));
		roster.add(new Arbalesters("Heaven's Ruby", Captain.boris));
		
	}
	
}
