package main.entity.armies;

import main.entity.captains.Generic;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.avialay.Jaywings;
import main.entity.regiments.avialay.Rooks;
import main.entity.regiments.feods.Praetoriae;
import main.entity.regiments.piknin.DoveMasters;
import main.entity.regiments.piknin.StoutOfHeart;
import main.entity.regiments.qoonfu.HairpinThrower;
import main.entity.regiments.qoonfu.Trainees;
import main.entity.regiments.terquits.Kinshiwang;
import main.entity.regiments.terquits.PebbleHurlers;
import main.entity.regiments.wanmen.Stoopvarmint;

public class MulticulturalSociety extends Army {

	private static final long serialVersionUID = 1L;

	public MulticulturalSociety() {

		super();
		name = "Society";

		roster.add(new StoutOfHeart("Piknin Heavies", new Generic(), Lieutenant.surgeon, Lieutenant.medic));
		roster.add(new DoveMasters("Piknin Supports", new Generic(), Lieutenant.errant));
		roster.add(new Stoopvarmint("Wanmen Cavalry", new Generic(), Lieutenant.paladin, Lieutenant.monstrosity));
		roster.add(new Kinshiwang("Terquit Anvils", new Generic(), Lieutenant.flagbearer, Lieutenant.musician));
		roster.add(new PebbleHurlers("Terquit Archers", new Generic(), Lieutenant.sergeant));
		roster.add(new Praetoriae("Feod Cavalry", new Generic(), Lieutenant.sergeant, Lieutenant.ambusher,
				Lieutenant.medic));
		roster.add(new Rooks("Avialay Tanks", new Generic(), Lieutenant.ambusher));
		roster.add(new Jaywings("Avialay Fliers", new Generic(), Lieutenant.scout));
		roster.add(new HairpinThrower("Qoonfu Archers", new Generic(), Lieutenant.monstrosity, Lieutenant.medic));
		roster.add(new Trainees("Qoonfu Reserves", new Generic(), Lieutenant.abomination, Lieutenant.surgeon));

		calculateValue();
		
		money = 88762;

	}

}
