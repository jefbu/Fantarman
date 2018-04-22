package main.entity.captains.pickles;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class Backface extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public Backface() {
		
		super();
		
		name = "Backface";
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
		
		bio = CaptainBio.backface;
		
		iconPath = "/portraits/backface.png";
		
		Captain professor = new Professor();
		String[] strings = new String[5];
		strings[0] = Conversations.backface_professor1;
		strings[1] = Conversations.backface_professor2;
		strings[2] = Conversations.backface_professor3;
		strings[3] = Conversations.backface_professor4;
		strings[4] = Conversations.backface_professor5;
		boolean[] ownVoice = new boolean[8];
		ownVoice[0] = true;
		ownVoice[1] = false;
		ownVoice[2] = false;
		ownVoice[3] = false;
		ownVoice[4] = true;
		
		conversations.add(new Conversation(this, professor, strings, ownVoice));
		
	}
	
}