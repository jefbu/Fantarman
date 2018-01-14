package main.entity.armies;

import main.entity.captains.Captain;
import main.entity.regiments.sacredCrux.BlazingLight;
import main.entity.regiments.sacredCrux.BlessedGarland;
import main.entity.regiments.sacredCrux.Cardinal;
import main.entity.regiments.sacredCrux.PristineShield;
import main.entity.regiments.sacredCrux.RedemptionSpirit;
import main.entity.regiments.sacredCrux.RepentantMany;
import main.entity.regiments.sacredCrux.ShiningFaithful;

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
