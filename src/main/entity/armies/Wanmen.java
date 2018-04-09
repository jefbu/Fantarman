package main.entity.armies;

import main.entity.captains.Boris;
import main.entity.captains.wanmen.Yiss;
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
		
		roster.add(new Stiltleg("Ashri", new Boris(), Lieutenant.paladin, Lieutenant.monstrosity, Lieutenant.scout));
		roster.add(new Stiltleg("Ashrini", new Boris(), Lieutenant.roland, Lieutenant.scout, Lieutenant.medic));
		roster.add(new FireMages("Skari", new Boris(), Lieutenant.errant));
		roster.add(new FireMages("Skarini", new Boris(), Lieutenant.errant));
		roster.add(new FireMages("Skarisin", new Boris(), Lieutenant.paladin));
		roster.add(new Metralyadora("Rushi", new Boris(), Lieutenant.errant, Lieutenant.ambusher));
		roster.add(new Stoopvarmint("Siszar", new Boris(), Lieutenant.errant, Lieutenant.surgeon));
		roster.add(new Stoopvarmint("Siszarni", new Yiss(), Lieutenant.paladin, Lieutenant.scout));
		roster.add(new Glasscannon("Sek Skra", new Boris(), Lieutenant.errant, Lieutenant.musician));
		roster.add(new Glasscannon("Sekni Skrani", new Boris(), Lieutenant.paladin, Lieutenant.monstrosity));

		calculateValue();
		
		money = 32150;
		
	}

}
