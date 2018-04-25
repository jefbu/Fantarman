package main.entity.captains.feods;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.captains.qoonfu.VinceLeonidas;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class Nerdo extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public Nerdo() {
		
		super();
		
		name = "Nerdo";
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
		
		bio = CaptainBio.nerdo;
		
		iconPath = "/portraits/terquit.png";
		
		Captain vinceLeonidas = new VinceLeonidas();
		String[] strings = new String[12];
		strings[0] = Conversations.nerdo_vince1;
		strings[1] = Conversations.nerdo_vince2;
		strings[2] = Conversations.nerdo_vince3;
		strings[3] = Conversations.nerdo_vince4;
		strings[4] = Conversations.nerdo_vince5;
		strings[5] = Conversations.nerdo_vince6;
		strings[6] = Conversations.nerdo_vince7;
		strings[7] = Conversations.nerdo_vince8;
		strings[8] = Conversations.nerdo_vince9;
		strings[9] = Conversations.nerdo_vince10;
		strings[10] = Conversations.nerdo_vince11;
		strings[11] = Conversations.nerdo_vince12;

		boolean[] ownVoice = new boolean[12];
		ownVoice[0] = true;
		ownVoice[1] = false;
		ownVoice[2] = true;
		ownVoice[3] = false;
		ownVoice[4] = true;
		ownVoice[5] = false;
		ownVoice[6] = true;
		ownVoice[7] = false;
		ownVoice[8] = true;
		ownVoice[9] = false;
		ownVoice[10] = true;
		ownVoice[11] = false;
		
		conversations.add(new Conversation(this, vinceLeonidas, strings, ownVoice));
		
		
	}

}