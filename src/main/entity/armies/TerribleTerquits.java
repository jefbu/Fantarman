package main.entity.armies;

import main.entity.captains.Boris;
import main.entity.captains.terribleTerquits.Morushi;
import main.entity.captains.terribleTerquits.Petto;
import main.entity.captains.terribleTerquits.Ryoushi;
import main.entity.captains.terribleTerquits.Tenjimoto;
import main.entity.captains.terribleTerquits.Tsumiko;
import main.entity.captains.terribleTerquits.Zuba;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.terquits.Arbalesters;
import main.entity.regiments.terquits.Kinshiwang;
import main.entity.regiments.terquits.PebbleHurlers;

public class TerribleTerquits extends Army {

	private static final long serialVersionUID = 1L;

	public TerribleTerquits() {
		
		super();
		name = "Terrible Terquits";
		
		roster.add(new Kinshiwang("Lacquered Doom", new Petto(), Lieutenant.flagbearer, Lieutenant.monstrosity));
		roster.add(new Kinshiwang("Clay Guards", new Morushi(), Lieutenant.musician, Lieutenant.errant));
		roster.add(new Kinshiwang("Earthen Vigil", new Ryoushi(), Lieutenant.flagbearer, Lieutenant.musician));
		roster.add(new Kinshiwang("Massive Soil", new Tsumiko(), Lieutenant.flagbearer, Lieutenant.abomination));
		roster.add(new PebbleHurlers("Stone Debris", new Zuba(), Lieutenant.emperor));
		roster.add(new PebbleHurlers("Diamond Jets", new Tenjimoto(), Lieutenant.flagbearer));
		roster.add(new Arbalesters("Pearl Arrows", new Boris(), Lieutenant.flagbearer, Lieutenant.musician));
		roster.add(new Arbalesters("Heaven's Ruby", new Boris(), Lieutenant.flagbearer, Lieutenant.musician));
		
		calculateValue();
		
		money = 8712;
	}
	
}
