package main.entity.captains.feods;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.captains.qoonfu.VinceLeonidas;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class FuriousCamilla extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public FuriousCamilla() {
		
		super();
		
		name = "Furious Camilla";
		gender = "female";
		
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
		
		bio = CaptainBio.furiousCamilla;
		
		iconPath = "/portraits/unknown.png";
		
		Captain vinceLeonidas = new VinceLeonidas();
		String[] strings = new String[9];
		strings[0] = Conversations.camilla_vince1;
		strings[1] = Conversations.camilla_vince2;
		strings[2] = Conversations.camilla_vince3;
		strings[3] = Conversations.camilla_vince4;
		strings[4] = Conversations.camilla_vince5;
		strings[5] = Conversations.camilla_vince6;
		strings[6] = Conversations.camilla_vince7;
		strings[7] = Conversations.camilla_vince8;
		strings[8] = Conversations.camilla_vince9;

		boolean[] ownVoice = new boolean[9];
		ownVoice[0] = true;
		ownVoice[1] = false;
		ownVoice[2] = true;
		ownVoice[3] = false;
		ownVoice[4] = false;
		ownVoice[5] = true;
		ownVoice[6] = false;
		ownVoice[7] = true;
		ownVoice[8] = false;
		
		
		conversations.add(new Conversation(this, vinceLeonidas, strings, ownVoice));
		
		Captain vinceLeonidas2 = new VinceLeonidas();
		String[] strings2 = new String[8];
		strings2[0] = Conversations.camilla_vinceBIS1;
		strings2[1] = Conversations.camilla_vinceBIS2;
		strings2[2] = Conversations.camilla_vinceBIS3;
		strings2[3] = Conversations.camilla_vinceBIS4;
		strings2[4] = Conversations.camilla_vinceBIS5;
		strings2[5] = Conversations.camilla_vinceBIS6;
		strings2[6] = Conversations.camilla_vinceBIS7;
		strings2[7] = Conversations.camilla_vinceBIS8;
		
		boolean[] ownVoice2 = new boolean[8];
		ownVoice2[0] = true;
		ownVoice2[1] = false;
		ownVoice2[2] = true;
		ownVoice2[3] = false;
		ownVoice2[4] = false;
		ownVoice2[5] = false;
		ownVoice2[6] = true;
		ownVoice2[7] = true;
		
		conversations.add(new Conversation(this, vinceLeonidas2, strings2, ownVoice2));
		
		
	}

}
