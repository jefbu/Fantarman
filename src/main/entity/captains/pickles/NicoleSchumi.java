package main.entity.captains.pickles;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class NicoleSchumi extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public NicoleSchumi() {
		
		super();
		
		name = "Nicole Schumi";
		gender = "female";
		
		attackBonus = 7;
		defenceBonus = 0;
		chargeBonus = 2;
		moraleBonus = 0;
		missileBonus = 0;
		speedBonus = 0;
		
		orders = 1;
		prestige = 30;
		
		skill1 = Skills.Deployer1;
		skill2 = Skills.Healer1;
		
		bio = CaptainBio.nicoleschumi;
		
		iconPath = "/portraits/mmeSauce.png";
		
	}
	
}
