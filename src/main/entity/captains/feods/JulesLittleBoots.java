package main.entity.captains.feods;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.captains.pickles.HansFlogl;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class JulesLittleBoots extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public JulesLittleBoots() {
		
		super();
		
		name = "Jules 'Little Boots'";
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
		
		bio = CaptainBio.julesLittleBoots;
		
		iconPath = "/portraits/unknown.png";
		
		OldCatherine oldCatherine = new OldCatherine();
		String[] strings = new String[7];
		strings[0] = Conversations.julesLittleBoots1;
		strings[1] = Conversations.julesLittleBoots2;
		strings[2] = Conversations.julesLittleBoots3;
		strings[3] = Conversations.julesLittleBoots4;
		strings[4] = Conversations.julesLittleBoots5;
		strings[5] = Conversations.julesLittleBoots6;
		strings[6] = Conversations.julesLittleBoots7;
		boolean[] ownVoice = new boolean[7];
		ownVoice[0] = true;
		ownVoice[1] = true;
		ownVoice[2] = true;
		ownVoice[3] = true;
		ownVoice[4] = true;
		ownVoice[5] = true;
		ownVoice[6] = false;
		
		conversations.add(new Conversation(this, oldCatherine, strings, ownVoice));
		
		HansFlogl hansFlogl = new HansFlogl();
		String[] strings2 = new String[5];
		strings2[0] = Conversations.jules_hans1;
		strings2[1] = Conversations.jules_hans2;
		strings2[2] = Conversations.jules_hans3;
		strings2[3] = Conversations.jules_hans4;
		strings2[4] = Conversations.jules_hans5;

		boolean[] ownVoice2 = new boolean[5];
		ownVoice2[0] = true;
		ownVoice2[1] = true;
		ownVoice2[2] = true;
		ownVoice2[3] = false;
		ownVoice2[4] = true;
		
		conversations.add(new Conversation(this, hansFlogl, strings2, ownVoice2));
		
		
	}

}
