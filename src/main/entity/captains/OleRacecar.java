package main.entity.captains;

import java.io.Serializable;

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
		
		Captain professor = new Professor();
		String[] strings = new String[4];
		strings[0] = Conversations.oleRacecar_professor1;
		strings[1] = Conversations.oleRacecar_professor2;
		strings[2] = Conversations.oleRacecar_professor3;
		strings[3] = Conversations.oleRacecar_professor4;
		boolean[] ownVoice = new boolean[8];
		ownVoice[0] = true;
		ownVoice[1] = false;
		ownVoice[2] = true;
		ownVoice[3] = true;
		
		conversations.add(new Conversation(this, professor, strings, ownVoice));
		
		
	}

}
