package main.entity.armies;

import main.entity.captains.Captain;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.avialay.Jaywings;
import main.entity.regiments.avialay.Rooks;
import main.entity.regiments.feods.PristineShield;
import main.entity.regiments.piknin.StoutOfHeart;
import main.entity.regiments.qoonfu.HairpinThrower;
import main.entity.regiments.qoonfu.Trainees;
import main.entity.regiments.terquits.Kinshiwang;
import main.entity.regiments.terquits.PebbleHurlers;
import main.entity.regiments.wanmen.FireMages;
import main.entity.regiments.wanmen.Stoopvarmint;

public class MulticulturalSociety extends Army {

	private static final long serialVersionUID = 1L;

	public MulticulturalSociety() {

		super();
		name = "Multicultural Society";

		roster.add(new StoutOfHeart("Piknin Heavies", Captain.boris, Lieutenant.surgeon, Lieutenant.medic));
		roster.add(new FireMages("Piknin Supports", Captain.boris, Lieutenant.errant));
		roster.add(new Stoopvarmint("Wanmen Cavalry", Captain.ole_racecar, Lieutenant.paladin, Lieutenant.monstrosity));
		roster.add(new Kinshiwang("Terquit Anvils", Captain.boris));
		roster.add(new PebbleHurlers("Terquit Archers", Captain.boris, Lieutenant.sergeant));
		roster.add(new PristineShield("Feod Cavalry", Captain.boris, Lieutenant.sergeant, Lieutenant.ambusher,
				Lieutenant.medic));
		roster.add(new Rooks("Avialay Tanks", Captain.boris, Lieutenant.ambusher));
		roster.add(new Jaywings("Avialay Fliers", Captain.boris, Lieutenant.scout));
		roster.add(new HairpinThrower("Qoonfu Archers", Captain.professor, Lieutenant.monstrosity, Lieutenant.medic));
		roster.add(new Trainees("Qoonfu Reserves", Captain.boris, Lieutenant.abomination, Lieutenant.surgeon));

		calculateValue();
		
		money = 88762;

	}

}
