package main.entity.armies;

import main.entity.captains.feods.FabianCuncta;
import main.entity.captains.feods.FuriousCamilla;
import main.entity.captains.feods.JulesLittleBoots;
import main.entity.captains.feods.MarkTheCrass;
import main.entity.captains.feods.MaxFQuenten;
import main.entity.captains.feods.Mum;
import main.entity.captains.feods.Nerdo;
import main.entity.captains.feods.OldCatherine;
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

		roster.add(new Hastatae("Scythia", new Nerdo(), Lieutenant.sergeant, Lieutenant.corporal));
		roster.add(new Hastatae("Adiutrix", new Mum(), Lieutenant.sergeant, Lieutenant.corporal));
		roster.add(new Triarae("Fretensis", new MaxFQuenten(), Lieutenant.sergeant, Lieutenant.corporal,
				Lieutenant.surgeon));
		roster.add(new Praetoriae("Victrix", new FabianCuncta(), Lieutenant.zealot, Lieutenant.sergeant,
				Lieutenant.surgeon));
		roster.add(new Equitae("Alaudae", new FuriousCamilla(), Lieutenant.sergeant, Lieutenant.corporal,
				Lieutenant.flagbearer));
		roster.add(new Alae("Fulminata", new OldCatherine(), Lieutenant.sergeant, Lieutenant.corporal));
		roster.add(new Legat("Little Boots", new JulesLittleBoots()));
		roster.add(new Velitae("Ferrata", new PompousMaggie(), Lieutenant.sergeant, Lieutenant.corporal,
				Lieutenant.scout));
		roster.add(new Velitae("Apollinaris", new MarkTheCrass(), Lieutenant.sergeant, Lieutenant.flagbearer,
				Lieutenant.musician));

		calculateValue();
		
		money = 57230;

	}

}
