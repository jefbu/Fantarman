package main.entity.armies;

import main.entity.captains.Captain;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.avialay.Corpus;
import main.entity.regiments.avialay.Gralyas;
import main.entity.regiments.avialay.Jackdaws;
import main.entity.regiments.avialay.Jaywings;
import main.entity.regiments.avialay.Magpies;
import main.entity.regiments.avialay.Nucifrags;
import main.entity.regiments.avialay.Rooks;

public class Skylords extends Army {

	private static final long serialVersionUID = 1L;

	public Skylords() {
		
		super();
		name = "Skylords";
		
		roster.add(new Corpus("Royal Crest", Captain.ole_racecar, Lieutenant.corporal));
		roster.add(new Jackdaws("Fledglings", Captain.boris, Lieutenant.corporal));
		roster.add(new Jackdaws("Down Feathers", Captain.boris, Lieutenant.corporal));
		roster.add(new Rooks("Mighty Talon", Captain.boris, Lieutenant.corporal));
		roster.add(new Gralyas("Preyers", Captain.boris));
		roster.add(new Jaywings("Cloudshakers", Captain.boris, Lieutenant.corporal));
		roster.add(new Jaywings("Skyward Arrows", Captain.boris, Lieutenant.medic));
		roster.add(new Nucifrags("Lost Beaks", Captain.boris));
		roster.add(new Magpies("Swallowtails", Captain.boris, Lieutenant.corporal));
		roster.add(new Gralyas("Hunting Stoops", Captain.boris));
		
		calculateValue();
		
	}

}
