package main.entity.captains;

import java.io.Serializable;

import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class HansFlogl extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public HansFlogl() {
		
		super();
		
		name = "Hans Flogl";
		gender = "male";
		
		attackBonus = 2;
		defenceBonus = 1;
		chargeBonus = 1;
		moraleBonus = 0;
		missileBonus = 1;
		speedBonus = 1;
		
		orders = 2;
		prestige = 15;
		
		skill1 = Skills.Deployer1;
		skill2 = Skills.Healer1;
		
		bio = CaptainBio.ole_racecar;
		
		iconPath = "/portraits/HansFlogl2.png";
		
	}
	
}



