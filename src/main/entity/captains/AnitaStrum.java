package main.entity.captains;

import java.io.Serializable;

import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class AnitaStrum extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public AnitaStrum() {
		
		super();
		
		name = "Anita Strum";
		gender = "female";
		
		attackBonus = 2;
		defenceBonus = 5;
		chargeBonus = 1;
		moraleBonus = 0;
		missileBonus = 0;
		speedBonus = 2;
		
		orders = 2;
		prestige = 20;
		
		skill1 = Skills.Deployer1;
		skill2 = Skills.Healer1;
		
		bio = CaptainBio.ole_racecar;
		
		iconPath = "/portraits/anita.png";
		
	}
	
}