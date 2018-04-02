package main.entity.armies;

import main.entity.captains.Captain;
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

		roster.add(new StoutOfHeart("Valiant Lads", Captain.boris, Lieutenant.Tenkai, Lieutenant.corporal));
		roster.add(new StoutOfHeart("Noble Chums", Captain.boris, Lieutenant.sergeant, Lieutenant.musician));
		roster.add(new FatherlyTurtle("Ole Racecar", Captain.ole_racecar));
		roster.add(new DoveMasters("Palomas", Captain.boris, Lieutenant.medic));
		roster.add(new DoveMasters("Coocoos", Captain.boris, Lieutenant.medic));
		roster.add(new Auxiliaries("2nd Line", Captain.hans_flogl, Lieutenant.surgeon));
		roster.add(new Harvesters("Pitchforks", Captain.boris, Lieutenant.medic, Lieutenant.musician));
		roster.add(new Harvesters("Tractors", Captain.boris, Lieutenant.surgeon, Lieutenant.scout));
		roster.add(new LightBalloons("PRS Dreadnought", Captain.professor));
		roster.add(new PonyRiders("Rock Horses", Captain.backface, Lieutenant.medic));
		roster.add(new PonyRiders("Mules with Mullets", Captain.anita_strum, Lieutenant.surgeon));
		roster.add(new DoveMasters("Doves de la Paz", Captain.boris, Lieutenant.medic));
		roster.add(new Harvesters("Trowels", Captain.boris, Lieutenant.surgeon, Lieutenant.medic));
		
		calculateValue();

		money = 135001;
	}

}
