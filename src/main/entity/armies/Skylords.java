package main.entity.armies;

import main.entity.captains.Boris;
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
		
		roster.add(new Corpus("Royal Crest", new Boris(), Lieutenant.scout));
		roster.add(new Jackdaws("Fledglings", new Boris(), Lieutenant.scout));
		roster.add(new Jackdaws("Down Feathers", new Boris(), Lieutenant.ambusher));
		roster.add(new Rooks("Mighty Talon", new Boris(), Lieutenant.peregrine));
		roster.add(new Gralyas("Preyers", new Boris()));
		roster.add(new Jaywings("Cloudshakers", new Boris(), Lieutenant.scout));
		roster.add(new Jaywings("Skyward Arrows", new Boris(), Lieutenant.scout));
		roster.add(new Nucifrags("Lost Beaks", new Boris()));
		roster.add(new Magpies("Swallowtails", new Boris(), Lieutenant.medic));
		roster.add(new Gralyas("Hunting Stoops", new Boris()));
		
		calculateValue();
		
		money = 1257;
		
	}

}
