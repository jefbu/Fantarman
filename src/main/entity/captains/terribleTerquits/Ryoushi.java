package main.entity.captains.terribleTerquits;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class Ryoushi extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public Ryoushi() {
		
		super();
		
		name = "Ryoushi";
		gender = "N.B.";
		
		attackBonus = 5;
		defenceBonus = 0;
		chargeBonus = 0;
		moraleBonus = 0;
		missileBonus = 0;
		speedBonus = 0;
		
		orders = 1;
		prestige = 45;
		
		skill1 = Skills.Healer2;
		skill2 = Skills.Deployer1;
		
		bio = CaptainBio.ryoushi;
		
		iconPath = "/portraits/unknown.png";
		
		
	}

}