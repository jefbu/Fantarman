package main.entity.armies;

import main.entity.captains.Captain;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.feods.BlessedGarland;
import main.entity.regiments.feods.Cardinal;
import main.entity.regiments.feods.RedemptionSpirit;
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

		roster.add(new DoveMasters("Leswasohs", Captain.boris, Lieutenant.medic));
		roster.add(new PonyRiders("Shevau", Captain.boris, Lieutenant.surgeon));
		roster.add(new FatherlyTurtle("Obi", Captain.ole_racecar));
		roster.add(new Cardinal("St Danny", Captain.boris));
		roster.add(new BlessedGarland("Grass Crowns", Captain.boris, Lieutenant.sergeant, Lieutenant.medic,
				Lieutenant.scout));
		roster.add(new RedemptionSpirit("Burning Belief", Captain.boris, Lieutenant.sergeant, Lieutenant.errant,
				Lieutenant.medic));
		roster.add(new DrunkenMaster("Huiyin", Captain.boris));
		roster.add(new CraneWing("Azure Wings", Captain.boris, Lieutenant.abomination, Lieutenant.corporal));
		roster.add(new TigerFist("Act of Strength", Captain.professor, Lieutenant.monstrosity, Lieutenant.medic));

		calculateValue();

	}

}
