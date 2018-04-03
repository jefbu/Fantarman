package main.entity.armies;

import main.entity.captains.Boris;
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
		
		roster.add(new SnakeTeeth("Cobras", new Boris(), Lieutenant.monstrosity));
		roster.add(new MonkeyPaw("Baboons", new Boris(), Lieutenant.monstrosity));
		roster.add(new TigerFist("Jaguars", new Boris(), Lieutenant.abomination, Lieutenant.corporal));
		roster.add(new CraneWing("Herons", new Boris(), Lieutenant.hugo, Lieutenant.medic));
		roster.add(new DrunkenMaster("Jackie", new Boris()));
		roster.add(new MantisClaw("Crickets", new Boris(), Lieutenant.abomination));
		roster.add(new HairpinThrower("Diadems", new Boris(), Lieutenant.monstrosity, Lieutenant.surgeon));
		roster.add(new Trainees("Wolf Cubs", new Boris(), Lieutenant.monstrosity, Lieutenant.corporal));
		roster.add(new Trainees("Tadpoles", new Boris(), Lieutenant.abomination, Lieutenant.monstrosity));

		calculateValue();
		
		money = 12230;
		
	}

}
