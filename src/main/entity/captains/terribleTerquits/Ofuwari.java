package main.entity.captains.terribleTerquits;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class Ofuwari extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public Ofuwari() {
		
		super();
		
		name = "Ofuwari";
		gender = "N.B.";
		
		attackBonus = 1;
		defenceBonus = 1;
		chargeBonus = 0;
		moraleBonus = 0;
		missileBonus = 0;
		speedBonus = 0;
		
		orders = 3;
		prestige = 25;
		
		skill1 = Skills.Healer2;
		skill2 = Skills.Deployer1;
		
		bio = CaptainBio.ofuwari;
		
		iconPath = "/portraits/unknown.png";
		
		
	}

}