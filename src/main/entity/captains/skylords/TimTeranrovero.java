package main.entity.captains.skylords;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class TimTeranrovero extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public TimTeranrovero() {
		
		super();
		
		name = "Tim Teranrovero";
		gender = "male";
		
		attackBonus = 0;
		defenceBonus = 2;
		chargeBonus = 5;
		moraleBonus = 2;
		missileBonus = 0;
		speedBonus = 1;
		
		orders = 2;
		prestige = 30;
		
		skill1 = Skills.Deployer1;
		skill2 = Skills.Healer1;
		
		bio = CaptainBio.timTeranrovero;
		
		iconPath = "/portraits/unknown.png";
		
	}
	
}