package main.entity.captains.wanmen;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class Yiss extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public Yiss() {
		
		super();
		
		name = "Yiss";
		gender = "female";
		
		attackBonus = 2;
		defenceBonus = 2;
		chargeBonus = 1;
		moraleBonus = 1;
		missileBonus = 0;
		speedBonus = 0;
		
		orders = 2;
		prestige = 25;
		
		skill1 = Skills.Healer2;
		skill2 = Skills.Deployer1;
		
		bio = CaptainBio.yiss;
		
		iconPath = "/portraits/unknown.png";
		
		
	}

}