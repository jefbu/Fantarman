package main.entity.captains.society;

import main.entity.captains.Captain;
import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class Mattressa extends Captain {
	
	private static final long serialVersionUID = 1L;

	public Mattressa() {
		
		super();
		
		name = "Mattressa";
		gender = "female";
		
		attackBonus = 1;
		defenceBonus = 2;
		chargeBonus = 2;
		moraleBonus = 3;
		missileBonus = 2;
		speedBonus = 3;
		
		orders = 3;
		prestige = 30;
		
		skill1 = Skills.Deployer1;
		skill2 = Skills.Healer1;
		
		bio = CaptainBio.mattressa;
		
		iconPath = "/portraits/unknown.png";
	
	}

}
