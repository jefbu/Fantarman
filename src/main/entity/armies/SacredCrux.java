package main.entity.armies;

import main.entity.captains.Boris;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.feods.BlazingLight;
import main.entity.regiments.feods.BlessedGarland;
import main.entity.regiments.feods.Cardinal;
import main.entity.regiments.feods.PristineShield;
import main.entity.regiments.feods.RedemptionSpirit;
import main.entity.regiments.feods.RepentantMany;
import main.entity.regiments.feods.ShiningFaithful;

public class SacredCrux extends Army {

	private static final long serialVersionUID = 1L;

	public SacredCrux() {

		name = "Order of the Sacred Crux";

		roster.add(new RepentantMany("Chastity", new Boris(), Lieutenant.sergeant, Lieutenant.corporal));
		roster.add(new RepentantMany("Temperance", new Boris(), Lieutenant.sergeant, Lieutenant.corporal));
		roster.add(new ShiningFaithful("Charity", new Boris(), Lieutenant.sergeant, Lieutenant.corporal,
				Lieutenant.surgeon));
		roster.add(new PristineShield("Diligence", new Boris(), Lieutenant.zealot, Lieutenant.sergeant,
				Lieutenant.surgeon));
		roster.add(new BlessedGarland("Patience", new Boris(), Lieutenant.sergeant, Lieutenant.corporal,
				Lieutenant.flagbearer));
		roster.add(new BlazingLight("Virtue", new Boris(), Lieutenant.sergeant, Lieutenant.corporal));
		roster.add(new Cardinal("Benedictus", new Boris()));
		roster.add(new RedemptionSpirit("Humility", new Boris(), Lieutenant.sergeant, Lieutenant.corporal,
				Lieutenant.scout));
		roster.add(new RedemptionSpirit("Kindness", new Boris(), Lieutenant.sergeant, Lieutenant.flagbearer,
				Lieutenant.musician));

		calculateValue();
		
		money = 57230;

	}

}
