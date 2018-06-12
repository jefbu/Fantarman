package main.entity.armies;

import main.entity.captains.Generic;
import main.entity.captains.skylords.EliryaRaiku;
import main.entity.captains.skylords.FionaGossip;
import main.entity.captains.skylords.LenaLuckless;
import main.entity.captains.skylords.SamMaxwell;
import main.entity.captains.skylords.StanManely;
import main.entity.captains.skylords.TimTeranrovero;
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
		
		roster.add(new Corpus("Royal Crest", new SamMaxwell(), Lieutenant.scout));
		roster.add(new Jackdaws("Fledglings", new TimTeranrovero(), Lieutenant.scout));
		roster.add(new Jackdaws("Down Feathers", new LenaLuckless(), Lieutenant.ambusher));
		roster.add(new Rooks("Mighty Talon", new StanManely(), Lieutenant.peregrine));
		roster.add(new Gralyas("Preyers", new EliryaRaiku()));
		roster.add(new Jaywings("Cloudshakers", new FionaGossip(), Lieutenant.scout));
		roster.add(new Jaywings("Skyward Arrows", new Generic(), Lieutenant.scout));
		roster.add(new Nucifrags("Lost Beaks", new Generic()));
		roster.add(new Magpies("Swallowtails", new Generic(), Lieutenant.medic));
		roster.add(new Gralyas("Hunting Stoops", new Generic()));
		
		calculateValue();
		
		money = 1257;
		
	}

}
