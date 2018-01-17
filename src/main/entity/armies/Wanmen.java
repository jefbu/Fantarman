package main.entity.armies;

import main.entity.captains.Captain;
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
		
		roster.add(new Stiltleg("Ashri", Captain.boris));
		roster.add(new Stiltleg("Ashrini", Captain.boris));
		roster.add(new FireMages("Skari", Captain.ole_racecar));
		roster.add(new FireMages("Skarini", Captain.boris));
		roster.add(new FireMages("Skarisin", Captain.boris));
		roster.add(new Metralyadora("Rushi", Captain.boris));
		roster.add(new Stoopvarmint("Siszar", Captain.boris));
		roster.add(new Stoopvarmint("Siszarni", Captain.boris));
		roster.add(new Glasscannon("Sek Skra", Captain.professor));
		roster.add(new Glasscannon("Sekni Skrani", Captain.boris));

		
	}

}
