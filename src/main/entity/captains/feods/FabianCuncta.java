package main.entity.captains.feods;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.captains.qoonfu.Chessmaster;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class FabianCuncta extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public FabianCuncta() {
		
		super();
		
		name = "Fabian Cuncta";
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
		
		bio = CaptainBio.fabianCuncta;
		
		iconPath = "/portraits/terquit.png";
		
		
		Captain chessmaster = new Chessmaster();
		String[] strings = new String[11];
		strings[0] = Conversations.fabian_chessmaster1;
		strings[1] = Conversations.fabian_chessmaster2;
		strings[2] = Conversations.fabian_chessmaster3;
		strings[3] = Conversations.fabian_chessmaster4;
		strings[4] = Conversations.fabian_chessmaster5;
		strings[5] = Conversations.fabian_chessmaster6;
		strings[6] = Conversations.fabian_chessmaster7;
		strings[7] = Conversations.fabian_chessmaster8;
		strings[8] = Conversations.fabian_chessmaster9;
		strings[9] = Conversations.fabian_chessmaster10;
		strings[10] = Conversations.fabian_chessmaster11;

		boolean[] ownVoice = new boolean[11];
		ownVoice[0] = true;
		ownVoice[1] = false;
		ownVoice[2] = true;
		ownVoice[3] = true;
		ownVoice[4] = true;
		ownVoice[5] = false;
		ownVoice[6] = true;
		ownVoice[7] = false;
		ownVoice[8] = false;
		ownVoice[9] = true;
		ownVoice[10] = false;
		
		conversations.add(new Conversation(this, chessmaster, strings, ownVoice));
		
		
	}

}
