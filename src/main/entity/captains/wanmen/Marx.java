package main.entity.captains.wanmen;

import main.entity.captains.Captain;
import main.entity.skills.Skills;
import main.strings.CaptainBio;

public class Marx extends Captain {
	
static final long serialVersionUID = 1L;

	public Marx() {
	
	super();
	
	name = "Essila";
	gender = "male";
	
	attackBonus = 2;
	defenceBonus = 2;
	chargeBonus = 1;
	moraleBonus = 1;
	missileBonus = 0;
	speedBonus = 0;
	
	orders = 2;
	prestige = 25;
	
	skill1 = Skills.Terrifying3;
	skill2 = Skills.Charismatic;
	
	bio = CaptainBio.marx;
	
	iconPath = "/portraits/marx.png";
	
	}

}
