package main.entity.armies;

import main.entity.captains.Captain;
import main.entity.regiments.FireMages;
import main.entity.regiments.piknin.DoveMasters;
import main.entity.regiments.piknin.Harvesters;
import main.entity.skills.Skills;

public class TestArmy extends Army {

	private static final long serialVersionUID = 1L;

	public TestArmy() {
		super();

		roster.add(new FireMages("Flammekuche", Captain.boris));
		roster.add(new FireMages("HotPots", new Captain("Julio", "Male", 0, 0, 0, 1, 1, 1, 2, 20, null, null)));
		roster.add(new FireMages("Explotions", new Captain("Anna", "Female", 0, 0, 0, 2, 1, 2, 2, 25, null, null)));
		roster.add(new FireMages("Bombers", new Captain("Burt", "N.B.", 0, 0, 0, 0, 1, 3, 2, 20, null, null)));

		roster.add(new DoveMasters("Palomas", new Captain("Shawnee", "Female", 0, 0, 0, 2, 0, 1, 2, 25, null, null)));
		roster.add(new DoveMasters("CooCoo", new Captain("Thomas", "Male", 0, 0, 0, 1, 1, 1, 1, 25, null, null)));
		roster.add(new DoveMasters("Wingz",
				new Captain("Lady Chartreuse", "Female", 0, 3, 0, 0, 1, 0, 3, 15, null, null)));
		roster.add(new DoveMasters("Zephyrs", new Captain("Fiona", "Female", 1, 1, 1, 1, 1, 1, 4, 40, null, null)));

		roster.add(
				new Harvesters("Trowels", new Captain("Tia", "Female", 0, 0, 0, 0, 0, 0, 2, 15, Skills.Healer2, null)));
		roster.add(new Harvesters("Pitchforks",
				new Captain("Bubba Bo Jr", "Male", 2, 1, 1, 0, 0, 0, 2, 25, Skills.Healer3, null)));
		roster.add(new Harvesters("Tractors", new Captain("Diesel", "Male", 1, 3, 0, 0, 0, 0, 2, 10, null, null)));

	}

}
