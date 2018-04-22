package main.entity.captains.pickles;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.captains.wanmen.Sassaru;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class OleRacecar extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public OleRacecar() {
		
		super();
		
		name = "Ole Racecar";
		gender = "female";
		
		attackBonus = 2;
		defenceBonus = 3;
		chargeBonus = 1;
		moraleBonus = 5;
		missileBonus = 0;
		speedBonus = 0;
		
		orders = 3;
		prestige = 40;
		
		skill1 = Skills.Healer2;
		skill2 = Skills.Deployer1;
		
		bio = CaptainBio.ole_racecar;
		
		iconPath = "/portraits/turtle3.png";
		
		Captain sassaru = new Sassaru();
		String[] strings = new String[5];
		strings[0] = Conversations.oleRacecar_sassaru1;
		strings[1] = Conversations.oleRacecar_sassaru2;
		strings[2] = Conversations.oleRacecar_sassaru3;
		strings[3] = Conversations.oleRacecar_sassaru4;
		strings[4] = Conversations.oleRacecar_sassaru5;
		boolean[] ownVoice = new boolean[8];
		ownVoice[0] = true;
		ownVoice[1] = true;
		ownVoice[2] = false;
		ownVoice[3] = true;
		ownVoice[4] = false;
		
		conversations.add(new Conversation(this, sassaru, strings, ownVoice));
		
		
	}

}
