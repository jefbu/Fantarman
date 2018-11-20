package main.entity.captains.metropolitans;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.captains.wanmen.Marx;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class Bakvits extends Captain {
	
	private static final long serialVersionUID = 1L;

	public Bakvits() {
		
		super();
		
		name = "Bakvits";
		gender = "male";
		
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
		
		bio = CaptainBio.bakvits;
		
		iconPath = "/portraits/bakvits.png";
		
		Captain marx = new Marx();
		String[] strings = new String[8];
		strings[0] = Conversations.bakvits_marx1;
		strings[1] = Conversations.bakvits_marx2;
		strings[2] = Conversations.bakvits_marx3;
		strings[3] = Conversations.bakvits_marx4;
		strings[4] = Conversations.bakvits_marx5;
		strings[5] = Conversations.bakvits_marx6;
		strings[6] = Conversations.bakvits_marx7;
		strings[7] = Conversations.bakvits_marx8;
		boolean[] ownVoice = new boolean[8];
		ownVoice[0] = true;
		ownVoice[1] = true;
		ownVoice[2] = false;
		ownVoice[3] = true;
		ownVoice[4] = true;
		ownVoice[5] = false;
		ownVoice[6] = true;
		ownVoice[7] = true;
		
		conversations.add(new Conversation(this, marx, strings, ownVoice));
	
	}

}
