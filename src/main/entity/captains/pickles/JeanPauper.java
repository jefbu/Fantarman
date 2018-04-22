package main.entity.captains.pickles;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class JeanPauper extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public JeanPauper() {
		
		super();
		
		name = "Jean the Pauper";
		gender = "male";
		
		attackBonus = 0;
		defenceBonus = 2;
		chargeBonus = 5;
		moraleBonus = 2;
		missileBonus = 0;
		speedBonus = 1;
		
		orders = 2;
		prestige = 30;
		
		skill1 = Skills.Deployer1;
		skill2 = Skills.Healer1;
		
		bio = CaptainBio.jeanpauper;
		
		iconPath = "/portraits/maitreOiseau.png";
		
	}
	
}