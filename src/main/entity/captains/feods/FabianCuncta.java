package main.entity.captains.feods;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class FabianCuncta extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public FabianCuncta() {
		
		super();
		
		name = "Fabian Cuncta";
		gender = "male";
		
		attackBonus = 5;
		defenceBonus = 0;
		chargeBonus = 0;
		moraleBonus = 0;
		missileBonus = 0;
		speedBonus = 0;
		
		orders = 1;
		prestige = 35;
		
		skill1 = Skills.Healer2;
		skill2 = Skills.Deployer1;
		
		bio = CaptainBio.fabianCuncta;
		
		iconPath = "/portraits/terquit.png";
		
		
	}

}
