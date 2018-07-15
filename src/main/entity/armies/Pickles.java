package main.entity.armies;

import main.entity.captains.pickles.AndySauce;
import main.entity.captains.pickles.AnitaStrum;
import main.entity.captains.pickles.Backface;
import main.entity.captains.pickles.Claudia;
import main.entity.captains.pickles.GalaxyChaser;
import main.entity.captains.pickles.HansFlogl;
import main.entity.captains.pickles.InternLydia;
import main.entity.captains.pickles.JeanPauper;
import main.entity.captains.pickles.MaitreOiseau;
import main.entity.captains.pickles.MmeSauce;
import main.entity.captains.pickles.NicoleSchumi;
import main.entity.captains.pickles.OleRacecar;
import main.entity.captains.pickles.Professor;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.piknin.Auxiliaries;
import main.entity.regiments.piknin.DoveMasters;
import main.entity.regiments.piknin.Harvesters;
import main.entity.regiments.piknin.LightBalloons;
import main.entity.regiments.piknin.ParentalTurtle;
import main.entity.regiments.piknin.PonyRiders;
import main.entity.regiments.piknin.StoutOfHeart;

public class Pickles extends Army {

	private static final long serialVersionUID = 1L;

	public Pickles() {
		
		super();
		name = "Piknin";

		roster.add(new StoutOfHeart("Valiant Lads", new NicoleSchumi(), Lieutenant.Tenkai, Lieutenant.corporal));
		roster.add(new StoutOfHeart("Noble Chums", new MmeSauce(), Lieutenant.sergeant, Lieutenant.musician));
		roster.add(new ParentalTurtle("Ole Racecar", new OleRacecar()));
		roster.add(new DoveMasters("Palomas", new MaitreOiseau(), Lieutenant.medic));
		roster.add(new DoveMasters("Coocoos", new GalaxyChaser(), Lieutenant.medic));
		roster.add(new Auxiliaries("2nd Line", new HansFlogl(), Lieutenant.surgeon));
		roster.add(new Harvesters("Pitchforks", new AnitaStrum(), Lieutenant.medic, Lieutenant.musician));
		roster.add(new Harvesters("Tractors", new Claudia(), Lieutenant.surgeon, Lieutenant.scout));
		roster.add(new LightBalloons("PRS Dreadnought", new Professor()));
		roster.add(new PonyRiders("Rock Horses", new Backface(), Lieutenant.medic));
		roster.add(new PonyRiders("Mules with Mullets", new JeanPauper(), Lieutenant.surgeon));
		roster.add(new DoveMasters("Doves de la Paz", new InternLydia(), Lieutenant.medic));
		roster.add(new Harvesters("Trowels", new AndySauce(), Lieutenant.surgeon, Lieutenant.medic));
		
		calculateValue();

		money = 135001;
	}

}
