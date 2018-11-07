package main.entity.armies;

import main.entity.captains.Generic;
import main.entity.captains.pickles.Ravel;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.feods.Equitae;
import main.entity.regiments.feods.Legat;
import main.entity.regiments.feods.Triarae;
import main.entity.regiments.piknin.DoveMasters;
import main.entity.regiments.piknin.ParentalTurtle;
import main.entity.regiments.piknin.PonyRiders;
import main.entity.regiments.qoonfu.CraneWing;
import main.entity.regiments.qoonfu.DrunkenMaster;
import main.entity.regiments.qoonfu.TigerFist;

public class Metropolitans extends Army {

	private static final long serialVersionUID = 1L;

	public Metropolitans() {

		super();
		name = "Metropolitans";

		roster.add(new DoveMasters("Ravel", new Ravel(), Lieutenant.medic));
		roster.add(new PonyRiders("Shevau", new Generic(), Lieutenant.surgeon));
		roster.add(new ParentalTurtle("Obi", new Generic()));
		roster.add(new Legat("St Danny", new Generic()));
		roster.add(new Equitae("Grass Crowns", new Generic(), Lieutenant.sergeant, Lieutenant.medic,
				Lieutenant.scout));
		roster.add(new Triarae("Burning Belief", new Generic(), Lieutenant.sergeant, Lieutenant.errant,
				Lieutenant.medic));
		roster.add(new DrunkenMaster("Huiyin", new Generic()));
		roster.add(new CraneWing("Azure Wings", new Generic(), Lieutenant.abomination, Lieutenant.corporal));
		roster.add(new TigerFist("Act of Strength", new Generic(), Lieutenant.monstrosity, Lieutenant.medic));

		calculateValue();
		
		money = 578;

	}

}
