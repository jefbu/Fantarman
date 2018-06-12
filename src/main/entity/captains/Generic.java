package main.entity.captains;

import java.io.Serializable;

import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class Generic extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public Generic() {
		
		super();
		
		name = "Generic";
		gender = "male";
		
		attackBonus = 0;
		defenceBonus = 0;
		chargeBonus = 5;
		moraleBonus = 0;
		missileBonus = 0;
		speedBonus = 0;
		
		orders = 2;
		prestige = 15;
		
		skill1 = Skills.Deployer1;
		skill2 = Skills.Healer1;
		
		bio = CaptainBio.noCaptain;
		
		iconPath = "/portraits/unknown.png";
		
	}
	
}
