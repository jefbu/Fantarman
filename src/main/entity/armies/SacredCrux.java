package main.entity.armies;

import main.entity.captains.Captain;
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
		
		roster.add(new RepentantMany("Chastity", Captain.boris));
		roster.add(new RepentantMany("Temperance", Captain.boris));
		roster.add(new ShiningFaithful("Charity", Captain.boris));
		roster.add(new PristineShield("Diligence", Captain.boris));
		roster.add(new BlessedGarland("Patience", Captain.boris));
		roster.add(new BlazingLight("Virtue", Captain.boris));
		roster.add(new Cardinal("Benedictus", Captain.boris));
		roster.add(new RedemptionSpirit("Humility", Captain.boris));
		roster.add(new RedemptionSpirit("Kindness", Captain.boris));
		
	}

}
