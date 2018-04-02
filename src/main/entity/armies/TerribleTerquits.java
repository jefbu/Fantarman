package main.entity.armies;

import main.entity.captains.Captain;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.terquits.Arbalesters;
import main.entity.regiments.terquits.Kinshiwang;
import main.entity.regiments.terquits.PebbleHurlers;

public class TerribleTerquits extends Army {

	private static final long serialVersionUID = 1L;

	public TerribleTerquits() {
		
		super();
		name = "Terrible Terquits";
		
		roster.add(new Kinshiwang("Lacquered Doom", Captain.boris, Lieutenant.flagbearer, Lieutenant.monstrosity));
		roster.add(new Kinshiwang("Clay Guards", Captain.boris, Lieutenant.musician, Lieutenant.errant));
		roster.add(new Kinshiwang("Earthen Vigil", Captain.boris, Lieutenant.flagbearer, Lieutenant.musician));
		roster.add(new Kinshiwang("Massive Soil", Captain.boris, Lieutenant.flagbearer, Lieutenant.abomination));
		roster.add(new PebbleHurlers("Stone Debris", Captain.boris, Lieutenant.emperor));
		roster.add(new PebbleHurlers("Diamond Jets", Captain.boris, Lieutenant.flagbearer));
		roster.add(new Arbalesters("Pearl Arrows", Captain.boris, Lieutenant.flagbearer, Lieutenant.musician));
		roster.add(new Arbalesters("Heaven's Ruby", Captain.boris, Lieutenant.flagbearer, Lieutenant.musician));
		
		calculateValue();
		
		money = 8712;
	}
	
}
