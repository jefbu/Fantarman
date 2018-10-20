package main.entity.captains.pickles;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.captains.feods.MarkTheCrass;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class AnitaStrum extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public AnitaStrum() {
		
		super();
		
		name = "Anita Strum";
		gender = "female";
		
		attackBonus = 2;
		defenceBonus = 5;
		chargeBonus = 1;
		moraleBonus = 0;
		missileBonus = 0;
		speedBonus = 2;
		
		orders = 2;
		prestige = 20;
		
		skill1 = Skills.Deployer1;
		skill2 = Skills.Healer1;
		
		bio = CaptainBio.anitaStrum;
		
		iconPath = "/portraits/anita.png";
		
		Captain markTheCrass = new MarkTheCrass();
		String[] strings = new String[13];
		strings[0] = Conversations.anita_markthecrass1;
		strings[1] = Conversations.anita_markthecrass2;
		strings[2] = Conversations.anita_markthecrass3;
		strings[3] = Conversations.anita_markthecrass4;
		strings[4] = Conversations.anita_markthecrass5;
		strings[5] = Conversations.anita_markthecrass6;
		strings[6] = Conversations.anita_markthecrass7;
		strings[7] = Conversations.anita_markthecrass8;
		strings[8] = Conversations.anita_markthecrass9;
		strings[9] = Conversations.anita_markthecrass10;
		strings[10] = Conversations.anita_markthecrass11;
		strings[11] = Conversations.anita_markthecrass12;
		strings[12] = Conversations.anita_markthecrass13;

		boolean[] ownVoice = new boolean[13];
		ownVoice[0] = true;
		ownVoice[1] = false;
		ownVoice[2] = true;
		ownVoice[3] = false;
		ownVoice[4] = true;
		ownVoice[5] = false;
		ownVoice[6] = true;
		ownVoice[7] = false;
		ownVoice[8] = false;
		ownVoice[9] = false;
		ownVoice[10] = true;
		ownVoice[11] = false;
		ownVoice[12] = true;
		
		conversations.add(new Conversation(this, markTheCrass, strings, ownVoice));
		
	}
	
}