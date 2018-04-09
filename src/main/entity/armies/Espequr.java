package main.entity.armies;

import main.entity.captains.feods.FabianCuncta;
import main.entity.captains.feods.FuriousCamilla;
import main.entity.captains.feods.JulesLittleBoots;
import main.entity.captains.feods.MarkTheCrass;
import main.entity.captains.feods.MaxFQuenten;
import main.entity.captains.feods.Mum;
import main.entity.captains.feods.Nerdo;
import main.entity.captains.feods.OldCatherineRepeats;
import main.entity.captains.feods.PompousMaggie;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.feods.Alae;
import main.entity.regiments.feods.Equitae;
import main.entity.regiments.feods.Hastatae;
import main.entity.regiments.feods.Legat;
import main.entity.regiments.feods.Praetoriae;
import main.entity.regiments.feods.Triarae;
import main.entity.regiments.feods.Velitae;

public class Espequr extends Army {

	private static final long serialVersionUID = 1L;

	public Espequr() {

		name = "Espequr";

		roster.add(new Hastatae("Chastity", new Nerdo(), Lieutenant.sergeant, Lieutenant.corporal));
		roster.add(new Hastatae("Temperance", new Mum(), Lieutenant.sergeant, Lieutenant.corporal));
		roster.add(new Triarae("Charity", new MaxFQuenten(), Lieutenant.sergeant, Lieutenant.corporal,
				Lieutenant.surgeon));
		roster.add(new Praetoriae("Diligence", new FabianCuncta(), Lieutenant.zealot, Lieutenant.sergeant,
				Lieutenant.surgeon));
		roster.add(new Equitae("Patience", new FuriousCamilla(), Lieutenant.sergeant, Lieutenant.corporal,
				Lieutenant.flagbearer));
		roster.add(new Alae("Virtue", new OldCatherineRepeats(), Lieutenant.sergeant, Lieutenant.corporal));
		roster.add(new Legat("Benedictus", new JulesLittleBoots()));
		roster.add(new Velitae("Humility", new PompousMaggie(), Lieutenant.sergeant, Lieutenant.corporal,
				Lieutenant.scout));
		roster.add(new Velitae("Kindness", new MarkTheCrass(), Lieutenant.sergeant, Lieutenant.flagbearer,
				Lieutenant.musician));

		calculateValue();
		
		money = 57230;

	}

}
