package main.entity.captains.pickles;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class Professor extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public Professor() {
		
		super();
		
		name = "The Professor";
		gender = "N.B.";
		
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
		
		bio = CaptainBio.The_Professor;
		
		iconPath = "/portraits/professor.png";
	
	}
}