package main.entity.armies;

import main.entity.captains.Captain;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.qoonfu.CraneWing;
import main.entity.regiments.qoonfu.DrunkenMaster;
import main.entity.regiments.qoonfu.HairpinThrower;
import main.entity.regiments.qoonfu.MantisClaw;
import main.entity.regiments.qoonfu.MonkeyPaw;
import main.entity.regiments.qoonfu.SnakeTeeth;
import main.entity.regiments.qoonfu.TigerFist;
import main.entity.regiments.qoonfu.Trainees;

public class ChiDestroyers extends Army {

	private static final long serialVersionUID = 1L;
	
	public ChiDestroyers() {
		
		super();
		name = "Chi Destroyers";
		
		roster.add(new SnakeTeeth("Cobras", Captain.boris, Lieutenant.monstrosity));
		roster.add(new MonkeyPaw("Baboons", Captain.boris, Lieutenant.monstrosity));
		roster.add(new TigerFist("Jaguars", Captain.boris, Lieutenant.abomination, Lieutenant.corporal));
		roster.add(new CraneWing("Herons", Captain.boris, Lieutenant.hugo, Lieutenant.medic));
		roster.add(new DrunkenMaster("Jackie", Captain.boris));
		roster.add(new MantisClaw("Crickets", Captain.boris, Lieutenant.abomination));
		roster.add(new HairpinThrower("Diadems", Captain.boris, Lieutenant.monstrosity, Lieutenant.surgeon));
		roster.add(new Trainees("Wolf Cubs", Captain.boris, Lieutenant.monstrosity, Lieutenant.corporal));
		roster.add(new Trainees("Tadpoles", Captain.boris, Lieutenant.abomination, Lieutenant.monstrosity));

		calculateValue();
		
		money = 12230;
		
	}

}
