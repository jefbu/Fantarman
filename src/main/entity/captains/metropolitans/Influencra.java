package main.entity.captains.metropolitans;

import main.entity.captains.Captain;
import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class Influencra extends Captain {

	private static final long serialVersionUID = 1L;

	public Influencra() {
		
		super();
		
		name = "Influencra";
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
		
		bio = CaptainBio.influencra;
		
		iconPath = "/portraits/influencra.png";
		
	}

}
