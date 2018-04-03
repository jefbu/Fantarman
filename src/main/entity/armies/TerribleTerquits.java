package main.entity.armies;

import main.entity.captains.Boris;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.terquits.Arbalesters;
import main.entity.regiments.terquits.Kinshiwang;
import main.entity.regiments.terquits.PebbleHurlers;

public class TerribleTerquits extends Army {

	private static final long serialVersionUID = 1L;

	public TerribleTerquits() {
		
		super();
		name = "Terrible Terquits";
		
		roster.add(new Kinshiwang("Lacquered Doom", new Boris(), Lieutenant.flagbearer, Lieutenant.monstrosity));
		roster.add(new Kinshiwang("Clay Guards", new Boris(), Lieutenant.musician, Lieutenant.errant));
		roster.add(new Kinshiwang("Earthen Vigil", new Boris(), Lieutenant.flagbearer, Lieutenant.musician));
		roster.add(new Kinshiwang("Massive Soil", new Boris(), Lieutenant.flagbearer, Lieutenant.abomination));
		roster.add(new PebbleHurlers("Stone Debris", new Boris(), Lieutenant.emperor));
		roster.add(new PebbleHurlers("Diamond Jets", new Boris(), Lieutenant.flagbearer));
		roster.add(new Arbalesters("Pearl Arrows", new Boris(), Lieutenant.flagbearer, Lieutenant.musician));
		roster.add(new Arbalesters("Heaven's Ruby", new Boris(), Lieutenant.flagbearer, Lieutenant.musician));
		
		calculateValue();
		
		money = 8712;
	}
	
}
