package main.entity.captains.feods;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.captains.qoonfu.VinceLeonidas;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class MaxFQuenten extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public MaxFQuenten() {
		
		super();
		
		name = "Max F Quenten";
		gender = "male";
		
		attackBonus = 5;
		defenceBonus = 0;
		chargeBonus = 0;
		moraleBonus = 0;
		missileBonus = 0;
		speedBonus = 0;
		
		orders = 1;
		prestige = 35;
		
		skill1 = Skills.Healer2;
		skill2 = Skills.Deployer1;
		
		bio = CaptainBio.maxFQuenten;
		
		iconPath = "/portraits/maxFQuenten.png";
		
		
		Captain vinceLeonidas = new VinceLeonidas();
		String[] strings = new String[5];
		strings[0] = Conversations.max_vince1;
		strings[1] = Conversations.max_vince2;
		strings[2] = Conversations.max_vince3;
		strings[3] = Conversations.max_vince4;
		strings[4] = Conversations.max_vince5;

		boolean[] ownVoice = new boolean[5];
		ownVoice[0] = true;
		ownVoice[1] = false;
		ownVoice[2] = true;
		ownVoice[3] = false;
		ownVoice[4] = true;
		
		conversations.add(new Conversation(this, vinceLeonidas, strings, ownVoice));
		
		
	}

}
