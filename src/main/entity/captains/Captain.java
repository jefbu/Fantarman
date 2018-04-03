package main.entity.captains;

import java.io.Serializable;
import java.util.ArrayList;

import main.entity.skills.Skills;

public class Captain implements Serializable {

	private static final long serialVersionUID = 1L;

	public String name;
	public String gender;

	public int attackBonus;
	public int defenceBonus;
	public int chargeBonus;
	public int moraleBonus;
	public int missileBonus;
	public int speedBonus;

	public int orders;
	public int prestige;

	public Skills skill1;
	public Skills skill2;

	public String bio;

	public String iconPath;
	
	public ArrayList<Conversation> conversations;

	public Captain() { 
		
		conversations = new ArrayList<Conversation>();
		
	}

}
