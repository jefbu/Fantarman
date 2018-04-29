package main.entity.captains.pickles;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class JeanPauper extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public JeanPauper() {
		
		super();
		
		name = "Jean the Pauper";
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
		
		bio = CaptainBio.jeanpauper;
		
		iconPath = "/portraits/maitreOiseau.png";
		
		Captain anita = new AnitaStrum();
		String[] strings = new String[7];
		strings[0] = Conversations.jeanpauper_anita1;
		strings[1] = Conversations.jeanpauper_anita2;
		strings[2] = Conversations.jeanpauper_anita3;
		strings[3] = Conversations.jeanpauper_anita4;
		strings[4] = Conversations.jeanpauper_anita5;
		strings[5] = Conversations.jeanpauper_anita6;
		strings[6] = Conversations.jeanpauper_anita7;
		boolean[] ownVoice = new boolean[8];
		ownVoice[0] = true;
		ownVoice[1] = true;
		ownVoice[2] = true;
		ownVoice[3] = true;
		ownVoice[4] = true;
		ownVoice[5] = true;
		ownVoice[6] = false;
		
		conversations.add(new Conversation(this, anita, strings, ownVoice));
		
	}
	
}