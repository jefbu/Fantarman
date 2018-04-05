package main.entity.armies;

import main.entity.captains.Boris;
import main.entity.captains.pickles.AnitaStrum;
import main.entity.captains.pickles.Backface;
import main.entity.captains.pickles.Claudia;
import main.entity.captains.pickles.HansFlogl;
import main.entity.captains.pickles.MmeSauce;
import main.entity.captains.pickles.OleRacecar;
import main.entity.captains.pickles.Professor;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.piknin.Auxiliaries;
import main.entity.regiments.piknin.DoveMasters;
import main.entity.regiments.piknin.FatherlyTurtle;
import main.entity.regiments.piknin.Harvesters;
import main.entity.regiments.piknin.LightBalloons;
import main.entity.regiments.piknin.PonyRiders;
import main.entity.regiments.piknin.StoutOfHeart;

public class Pickles extends Army {

	private static final long serialVersionUID = 1L;

	public Pickles() {
		
		super();
		name = "Piknin Pickles";

		roster.add(new StoutOfHeart("Valiant Lads", new Boris(), Lieutenant.Tenkai, Lieutenant.corporal));
		roster.add(new StoutOfHeart("Noble Chums", new MmeSauce(), Lieutenant.sergeant, Lieutenant.musician));
		roster.add(new FatherlyTurtle("Ole Racecar", new OleRacecar()));
		roster.add(new DoveMasters("Palomas", new Boris(), Lieutenant.medic));
		roster.add(new DoveMasters("Coocoos", new Boris(), Lieutenant.medic));
		roster.add(new Auxiliaries("2nd Line", new HansFlogl(), Lieutenant.surgeon));
		roster.add(new Harvesters("Pitchforks", new Boris(), Lieutenant.medic, Lieutenant.musician));
		roster.add(new Harvesters("Tractors", new Claudia(), Lieutenant.surgeon, Lieutenant.scout));
		roster.add(new LightBalloons("PRS Dreadnought", new Professor()));
		roster.add(new PonyRiders("Rock Horses", new Backface(), Lieutenant.medic));
		roster.add(new PonyRiders("Mules with Mullets", new AnitaStrum(), Lieutenant.surgeon));
		roster.add(new DoveMasters("Doves de la Paz", new Boris(), Lieutenant.medic));
		roster.add(new Harvesters("Trowels", new Boris(), Lieutenant.surgeon, Lieutenant.medic));
		
		calculateValue();

		money = 135001;
	}

}
