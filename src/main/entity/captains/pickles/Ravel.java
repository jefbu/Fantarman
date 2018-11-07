package main.entity.captains.pickles;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class Ravel extends Captain {
	
	private static final long serialVersionUID = 1L;

	public Ravel() {
		
		super();
		
		name = "Ravel";
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
		
		bio = CaptainBio.ravel;
		
		iconPath = "/portraits/ravel.png";
		
		Captain galaxyChaser = new GalaxyChaser();
		String[] strings = new String[9];
		strings[0] = Conversations.ravel_galaxyChaser1;
		strings[1] = Conversations.ravel_galaxyChaser2;
		strings[2] = Conversations.ravel_galaxyChaser3;
		strings[3] = Conversations.ravel_galaxyChaser4;
		strings[4] = Conversations.ravel_galaxyChaser5;
		strings[5] = Conversations.ravel_galaxyChaser6;
		strings[6] = Conversations.ravel_galaxyChaser7;
		strings[7] = Conversations.ravel_galaxyChaser8;
		strings[8] = Conversations.ravel_galaxyChaser9;
		boolean[] ownVoice = new boolean[9];
		ownVoice[0] = false;
		ownVoice[1] = true;
		ownVoice[2] = false;
		ownVoice[3] = true;
		ownVoice[4] = true;
		ownVoice[5] = false;
		ownVoice[6] = true;
		ownVoice[7] = false;
		ownVoice[8] = true;
		
		conversations.add(new Conversation(this, galaxyChaser, strings, ownVoice));
	
	}

}
