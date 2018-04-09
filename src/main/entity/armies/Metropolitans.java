package main.entity.armies;

import main.entity.captains.Boris;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.feods.Equitae;
import main.entity.regiments.feods.Legat;
import main.entity.regiments.feods.Triarae;
import main.entity.regiments.piknin.DoveMasters;
import main.entity.regiments.piknin.FatherlyTurtle;
import main.entity.regiments.piknin.PonyRiders;
import main.entity.regiments.qoonfu.CraneWing;
import main.entity.regiments.qoonfu.DrunkenMaster;
import main.entity.regiments.qoonfu.TigerFist;

public class Metropolitans extends Army {

	private static final long serialVersionUID = 1L;

	public Metropolitans() {

		super();
		name = "Metropolitans";

		roster.add(new DoveMasters("Leswasohs", new Boris(), Lieutenant.medic));
		roster.add(new PonyRiders("Shevau", new Boris(), Lieutenant.surgeon));
		roster.add(new FatherlyTurtle("Obi", new Boris()));
		roster.add(new Legat("St Danny", new Boris()));
		roster.add(new Equitae("Grass Crowns", new Boris(), Lieutenant.sergeant, Lieutenant.medic,
				Lieutenant.scout));
		roster.add(new Triarae("Burning Belief", new Boris(), Lieutenant.sergeant, Lieutenant.errant,
				Lieutenant.medic));
		roster.add(new DrunkenMaster("Huiyin", new Boris()));
		roster.add(new CraneWing("Azure Wings", new Boris(), Lieutenant.abomination, Lieutenant.corporal));
		roster.add(new TigerFist("Act of Strength", new Boris(), Lieutenant.monstrosity, Lieutenant.medic));

		calculateValue();
		
		money = 578;

	}

}
