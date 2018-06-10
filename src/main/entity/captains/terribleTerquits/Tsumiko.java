package main.entity.captains.terribleTerquits;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class Tsumiko extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public Tsumiko() {
		
		super();
		
		name = "Tsumiko";
		gender = "N.B.";
		
		attackBonus = 1;
		defenceBonus = 1;
		chargeBonus = 3;
		moraleBonus = 0;
		missileBonus = 0;
		speedBonus = 1;
		
		orders = 1;
		prestige = 25;
		
		skill1 = Skills.Healer2;
		skill2 = Skills.Deployer1;
		
		bio = CaptainBio.tsumiko;
		
		iconPath = "/portraits/unknown.png";
		
		
	}

}