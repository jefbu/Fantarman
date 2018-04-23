package main.entity.captains.skylords;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.captains.qoonfu.Chun;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class FionaGossip extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public FionaGossip() {
		
		super();
		
		name = "Fiona Gossip";
		gender = "female";
		
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
		
		bio = CaptainBio.fionaGossip;
		
		iconPath = "/portraits/chessmaster.png";
		
		
		Captain chun = new Chun();
		String[] strings = new String[13];
		strings[0] = Conversations.fiona_chun1;
		strings[1] = Conversations.fiona_chun2;
		strings[2] = Conversations.fiona_chun3;
		strings[3] = Conversations.fiona_chun4;
		strings[4] = Conversations.fiona_chun5;
		strings[5] = Conversations.fiona_chun6;
		strings[6] = Conversations.fiona_chun7;
		strings[7] = Conversations.fiona_chun8;
		strings[8] = Conversations.fiona_chun9;
		strings[9] = Conversations.fiona_chun10;
		strings[10] = Conversations.fiona_chun11;
		strings[11] = Conversations.fiona_chun12;
		strings[12] = Conversations.fiona_chun13;
		boolean[] ownVoice = new boolean[13];
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
		ownVoice[12] = true;
		
		conversations.add(new Conversation(this, chun, strings, ownVoice));
		
	}
	
}