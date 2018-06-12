package main.entity.captains.terribleTerquits;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class Petto extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public Petto() {
		super();
		
		name = "Petto";
		gender = "N.B.";
		
		attackBonus = 1;
		defenceBonus = 3;
		chargeBonus = 1;
		moraleBonus = 0;
		missileBonus = 0;
		speedBonus = 0;
		
		orders = 3;
		prestige = 30;
		
		skill1 = Skills.Healer2;
		skill2 = Skills.Deployer1;
		
		bio = CaptainBio.petto;
		
		iconPath = "/portraits/terquit.png";
		
		Captain zuba = new Zuba();
		String[] strings = new String[9];
		strings[0] = Conversations.petto_zuba1;
		strings[1] = Conversations.petto_zuba2;
		strings[2] = Conversations.petto_zuba3;
		strings[3] = Conversations.petto_zuba4;
		strings[4] = Conversations.petto_zuba5;
		strings[5] = Conversations.petto_zuba6;
		strings[6] = Conversations.petto_zuba7;
		strings[7] = Conversations.petto_zuba8;
		strings[8] = Conversations.petto_zuba9;
		boolean[] ownVoice = new boolean[9];
		ownVoice[0] = true;
		ownVoice[1] = false;
		ownVoice[2] = true;
		ownVoice[3] = false;
		ownVoice[4] = true;
		ownVoice[5] = false;
		ownVoice[6] = false;
		ownVoice[7] = true;
		ownVoice[8] = true;
		
		conversations.add(new Conversation(this, zuba, strings, ownVoice));
		
		
	}

}
