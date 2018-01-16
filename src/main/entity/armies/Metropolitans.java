package main.entity.armies;

import main.entity.captains.Captain;
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
		
		roster.add(new DoveMasters("Leswasohs", Captain.boris));
		roster.add(new PonyRiders("Shevau", Captain.boris));
		roster.add(new FatherlyTurtle("Obi", Captain.ole_racecar));
		roster.add(new Cardinal("St Danny", Captain.boris));
		roster.add(new BlessedGarland("Grass Crowns", Captain.boris));
		roster.add(new RedemptionSpirit("Burning Belief", Captain.boris));
		roster.add(new DrunkenMaster("Huiyin", Captain.boris));
		roster.add(new CraneWing("Azure Wings", Captain.boris));
		roster.add(new TigerFist("Act of Strength", Captain.professor));
		
	}

}
