package main.entity.armies;

import main.entity.captains.Captain;
import main.entity.regiments.FireMages;
import main.entity.regiments.piknin.DoveMasters;
import main.entity.regiments.piknin.Harvesters;

public class TestArmy extends Army {

	private static final long serialVersionUID = 1L;

	public TestArmy() {
		super();

		roster.add(new FireMages("Flammekuche", Captain.boris));
		roster.add(new FireMages("HotPots", Captain.boris));
		roster.add(new FireMages("Explotions", Captain.boris));
		roster.add(new FireMages("Bombers", Captain.boris));

		roster.add(new DoveMasters("Palomas", Captain.boris));
		roster.add(new DoveMasters("CooCoo", Captain.boris));
		roster.add(new DoveMasters("Wingz", Captain.boris));
		roster.add(new DoveMasters("Zephyrs", Captain.boris));
		roster.add(new Harvesters("Trowels", Captain.boris));
		roster.add(new Harvesters("Pitchforks",Captain.boris));
		roster.add(new Harvesters("Tractors", Captain.boris));

	}

}
