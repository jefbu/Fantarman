package main.entity.captains.qoonfu;

import java.io.Serializable;

import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.strings.Conversations;

public class JiaoSidao extends Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public JiaoSidao() {
		
		super();
		
		name = "Jiao Sidao";
		gender = "male";
		
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
		
		bio = CaptainBio.jiaoSidao;
		
		iconPath = "/portraits/unknown.png";
		
		Captain miyouin = new Miyouin();
		String[] strings = new String[15];
		strings[0] = Conversations.jiaosidao_miyouin1;
		strings[1] = Conversations.jiaosidao_miyouin2;
		strings[2] = Conversations.jiaosidao_miyouin3;
		strings[3] = Conversations.jiaosidao_miyouin4;
		strings[4] = Conversations.jiaosidao_miyouin5;
		strings[5] = Conversations.jiaosidao_miyouin6;
		strings[6] = Conversations.jiaosidao_miyouin7;
		strings[7] = Conversations.jiaosidao_miyouin8;
		strings[8] = Conversations.jiaosidao_miyouin9;
		strings[9] = Conversations.jiaosidao_miyouin10;
		strings[10] = Conversations.jiaosidao_miyouin11;
		strings[11] = Conversations.jiaosidao_miyouin12;
		strings[12] = Conversations.jiaosidao_miyouin13;
		strings[13] = Conversations.jiaosidao_miyouin14;
		strings[14] = Conversations.jiaosidao_miyouin15;
		boolean[] ownVoice = new boolean[15];
		ownVoice[0] = true;
		ownVoice[1] = false;
		ownVoice[2] = true;
		ownVoice[3] = false;
		ownVoice[4] = true;
		ownVoice[5] = true;
		ownVoice[6] = true;
		ownVoice[7] = true;
		ownVoice[8] = true;
		ownVoice[9] = true;
		ownVoice[10] = true;
		ownVoice[11] = false;
		ownVoice[12] = false;
		ownVoice[13] = false;
		ownVoice[14] = false;
		
		conversations.add(new Conversation(this, miyouin, strings, ownVoice));
		
	}
	
}