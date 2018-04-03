package main.entity.armies;

import main.entity.captains.Boris;
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

		roster.add(new StoutOfHeart("Piknin Heavies", new Boris(), Lieutenant.surgeon, Lieutenant.medic));
		roster.add(new FireMages("Piknin Supports", new Boris(), Lieutenant.errant));
		roster.add(new Stoopvarmint("Wanmen Cavalry", new Boris(), Lieutenant.paladin, Lieutenant.monstrosity));
		roster.add(new Kinshiwang("Terquit Anvils", new Boris(), Lieutenant.flagbearer, Lieutenant.musician));
		roster.add(new PebbleHurlers("Terquit Archers", new Boris(), Lieutenant.sergeant));
		roster.add(new PristineShield("Feod Cavalry", new Boris(), Lieutenant.sergeant, Lieutenant.ambusher,
				Lieutenant.medic));
		roster.add(new Rooks("Avialay Tanks", new Boris(), Lieutenant.ambusher));
		roster.add(new Jaywings("Avialay Fliers", new Boris(), Lieutenant.scout));
		roster.add(new HairpinThrower("Qoonfu Archers", new Boris(), Lieutenant.monstrosity, Lieutenant.medic));
		roster.add(new Trainees("Qoonfu Reserves", new Boris(), Lieutenant.abomination, Lieutenant.surgeon));

		calculateValue();
		
		money = 88762;

	}

}
