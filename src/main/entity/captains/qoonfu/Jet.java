package main.entity.captains.qoonfu;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class Jet extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public Jet() {
		
		super();
		
		name = "Jet";
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
		
		bio = CaptainBio.jet;
		
		iconPath = "/portraits/unknown.png";
		
		Jackie jackie = new Jackie();
		String[] strings = new String[9];
		strings[0] = Conversations.jet_jackie1;
		strings[1] = Conversations.jet_jackie2;
		strings[2] = Conversations.jet_jackie3;
		strings[3] = Conversations.jet_jackie4;
		strings[4] = Conversations.jet_jackie5;
		strings[5] = Conversations.jet_jackie6;
		strings[6] = Conversations.jet_jackie7;
		strings[7] = Conversations.jet_jackie8;
		strings[8] = Conversations.jet_jackie9;
		boolean[] ownVoice = new boolean[9];
		ownVoice[0] = true;
		ownVoice[1] = true;
		ownVoice[2] = false;
		ownVoice[3] = false;
		ownVoice[4] = true;
		ownVoice[5] = false;
		ownVoice[6] = false;
		ownVoice[7] = false;
		ownVoice[8] = true;
		
		conversations.add(new Conversation(this, jackie, strings, ownVoice));
		
	}
	
}