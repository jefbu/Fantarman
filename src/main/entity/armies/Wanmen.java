package main.entity.armies;

import main.entity.captains.Captain;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.wanmen.FireMages;
import main.entity.regiments.wanmen.Glasscannon;
import main.entity.regiments.wanmen.Metralyadora;
import main.entity.regiments.wanmen.Stiltleg;
import main.entity.regiments.wanmen.Stoopvarmint;

public class Wanmen extends Army {

	private static final long serialVersionUID = 1L;

	public Wanmen() {
		
		super();
		name = "Wanted Wanmen";
		
		roster.add(new Stiltleg("Ashri", Captain.boris, Lieutenant.paladin, Lieutenant.monstrosity, Lieutenant.scout));
		roster.add(new Stiltleg("Ashrini", Captain.boris, Lieutenant.roland, Lieutenant.scout, Lieutenant.medic));
		roster.add(new FireMages("Skari", Captain.ole_racecar, Lieutenant.errant));
		roster.add(new FireMages("Skarini", Captain.boris, Lieutenant.errant));
		roster.add(new FireMages("Skarisin", Captain.boris, Lieutenant.paladin));
		roster.add(new Metralyadora("Rushi", Captain.boris, Lieutenant.errant, Lieutenant.ambusher));
		roster.add(new Stoopvarmint("Siszar", Captain.boris, Lieutenant.errant, Lieutenant.surgeon));
		roster.add(new Stoopvarmint("Siszarni", Captain.boris, Lieutenant.paladin, Lieutenant.scout));
		roster.add(new Glasscannon("Sek Skra", Captain.professor, Lieutenant.errant, Lieutenant.musician));
		roster.add(new Glasscannon("Sekni Skrani", Captain.boris, Lieutenant.paladin, Lieutenant.monstrosity));

		calculateValue();
		
		money = 32150;
		
	}

}
