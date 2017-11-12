package main.entity.armies;

import main.entity.captains.Captain;
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

		roster.add(new StoutOfHeart("Valiant Lads", Captain.boris));
		roster.add(new StoutOfHeart("Noble Chums", Captain.boris));
		roster.add(new FatherlyTurtle("Ole Racecar", Captain.ole_racecar));
		roster.add(new DoveMasters("Palomas", Captain.boris));
		roster.add(new DoveMasters("Coocoos", Captain.boris));
		roster.add(new Auxiliaries("2nd Line", Captain.boris));
		roster.add(new Harvesters("Pitchforks", Captain.boris));
		roster.add(new Harvesters("Tractors", Captain.boris));
		roster.add(new LightBalloons("PRS Dreadnought", Captain.professor));
		roster.add(new PonyRiders("Rock Horses", Captain.boris));
		roster.add(new PonyRiders("Mules with Mullets", Captain.boris));
		roster.add(new DoveMasters("Doves de la Paz", Captain.boris));
		roster.add(new Harvesters("Trowels", Captain.boris));
		
		

		
	}

}
