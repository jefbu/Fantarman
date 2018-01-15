package main.entity.armies;

import main.entity.captains.Captain;
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
		
		roster.add(new SnakeTeeth("Cobras", Captain.boris));
		roster.add(new MonkeyPaw("Baboons", Captain.boris));
		roster.add(new TigerFist("Jaguars", Captain.ole_racecar));
		roster.add(new CraneWing("Herons", Captain.boris));
		roster.add(new DrunkenMaster("Jackie", Captain.boris));
		roster.add(new MantisClaw("Crickets", Captain.boris));
		roster.add(new HairpinThrower("Diadems", Captain.boris));
		roster.add(new Trainees("Wolf Cubs", Captain.boris));
		roster.add(new Trainees("Tadpoles", Captain.professor));

		
	}

}
