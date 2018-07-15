package main.entity.armies;

import main.entity.captains.qoonfu.Chessmaster;
import main.entity.captains.qoonfu.Chun;
import main.entity.captains.qoonfu.HuiSun;
import main.entity.captains.qoonfu.Jackie;
import main.entity.captains.qoonfu.Jet;
import main.entity.captains.qoonfu.JiaoSidao;
import main.entity.captains.qoonfu.Miyouin;
import main.entity.captains.qoonfu.PiercingGaze;
import main.entity.captains.qoonfu.VinceLeonidas;
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
		name = "Chi";
		
		roster.add(new SnakeTeeth("Cobras", new PiercingGaze(), Lieutenant.monstrosity));
		roster.add(new MonkeyPaw("Baboons", new VinceLeonidas(), Lieutenant.monstrosity));
		roster.add(new TigerFist("Jaguars", new Chessmaster(), Lieutenant.abomination, Lieutenant.corporal));
		roster.add(new CraneWing("Herons", new HuiSun(), Lieutenant.hugo, Lieutenant.medic));
		roster.add(new DrunkenMaster("Jackie", new Jackie()));
		roster.add(new MantisClaw("Crickets", new JiaoSidao(), Lieutenant.abomination));
		roster.add(new HairpinThrower("Diadems", new Miyouin(), Lieutenant.monstrosity, Lieutenant.surgeon));
		roster.add(new Trainees("Wolf Cubs", new Chun(), Lieutenant.monstrosity, Lieutenant.corporal));
		roster.add(new Trainees("Tadpoles", new Jet(), Lieutenant.abomination, Lieutenant.monstrosity));

		calculateValue();
		
		money = 12230;
		
	}

}
