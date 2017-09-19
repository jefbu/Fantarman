package main.entity.armies;

import main.entity.captains.Captain;
import main.entity.regiments.DoveMasters;
import main.entity.regiments.FireMages;
import main.entity.regiments.Harvesters;

public class TestArmy extends Army {
	
	public TestArmy() {
		super();
		
		roster.add(new FireMages("Flammekuche", Captain.boris));
		roster.add(new FireMages("HotPots", new Captain("Julio", 0, 0, 0, 1, 1, 1)));
		roster.add(new FireMages("Explotions", new Captain("Anna", 0, 0, 0, 2, 1, 2)));
		roster.add(new FireMages("Bombers", new Captain("Burt", 0, 0, 0, 0, 1, 3)));

		roster.add(new DoveMasters("Palomas", new Captain("Shawnee", 0, 0, 0, 2, 0, 1)));
		roster.add(new DoveMasters("CooCoo", new Captain("Thomas", 0, 0, 0, 1, 1, 1)));
		roster.add(new DoveMasters("Wingz", new Captain("Lady Chartreuse", 0, 3, 0, 0, 1, 0)));
		roster.add(new DoveMasters("Zephyrs", new Captain("Fiona", 1, 1, 1, 1, 1, 1)));
		
		roster.add(new Harvesters("Trowels", new Captain("Tia", 0, 0, 0, 0, 0, 0)));
		roster.add(new Harvesters("Pitchforks", new Captain("Bubba Bo Jr", 2, 1, 1, 0, 0, 0)));
		roster.add(new Harvesters("Tractors", new Captain("Diesel", 1, 3, 0, 0, 0, 0)));
		

	}

}
