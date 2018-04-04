package main.entity.captains.terribleTerquits;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class Zuba extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public Zuba() {
		
		super();
		
		name = "Zuba";
		gender = "N.B.";
		
		attackBonus = 2;
		defenceBonus = 4;
		chargeBonus = 2;
		moraleBonus = 1;
		missileBonus = 0;
		speedBonus = 0;
		
		orders = 2;
		prestige = 50;
		
		skill1 = Skills.Healer2;
		skill2 = Skills.Deployer1;
		
		bio = CaptainBio.zuba;
		
		iconPath = "/portraits/terquit.png";
		
		
	}

}