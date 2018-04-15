package main.entity.lieutenants;

import java.io.Serializable;

import main.entity.skills.Skills;

public class Lieutenant implements Serializable {

	private static final long serialVersionUID = 1L;
	public String name;
	public String bonus;

	public Skills bonusSkill;

	public String imagePath;

	public Lieutenant(String name, String bonus, Skills bonusSkill, String path) {

		this.name = name;
		this.bonus = bonus;
		this.bonusSkill = bonusSkill;

		this.imagePath = path;

	}

	//Piknin
	public static Lieutenant medic = new Lieutenant("First Aid Medic", "Healer 1", Skills.Healer1,
			"/lieutenants/medic.png");
	public static Lieutenant surgeon = new Lieutenant("Surgeon", "Healer 2", Skills.Healer2,
			"/lieutenants/surgeon.png");
	public static Lieutenant Tenkai = new Lieutenant("Old Man Tenkai", "Healer 3", Skills.Healer3,
			"/lieutenants/sergeant.png");

	//Feods
	public static Lieutenant corporal = new Lieutenant("Corporal", "Leader 1", Skills.Leader1,
			"/lieutenants/corporal.png");
	public static Lieutenant sergeant = new Lieutenant("Sergeant", "Leader 2", Skills.Leader2,
			"/lieutenants/sergeant.png");
	public static Lieutenant zealot = new Lieutenant("Zealous Francisco", "Leader 3", Skills.Leader3,
			"/lieutenants/sergeant.png");

	//Terquit
	public static Lieutenant musician = new Lieutenant("Musician", "Discplined 1", Skills.Disciplined1,
			"/lieutenants/sergeant.png");
	public static Lieutenant flagbearer = new Lieutenant("Standard Bearer", "Disciplined 2", Skills.Disciplined2,
			"/lieutenants/sergeant.png");
	public static Lieutenant emperor = new Lieutenant("Little Emperor", "Disciplined 3", Skills.Disciplined3,
			"/lieutenants/sergeant.png");

	//Avialay
	public static Lieutenant scout = new Lieutenant("Scout", "Deployer 1", Skills.Deployer1,
			"/lieutenants/scout.png");
	public static Lieutenant ambusher = new Lieutenant("Ambusher", "Deployer 2", Skills.Deployer2,
			"/lieutenants/sergeant.png");
	public static Lieutenant peregrine = new Lieutenant("Peregrine Sharpeye", "Deployer 3", Skills.Deployer3,
			"/lieutenants/sergeant.png");

	//Wanmen
	public static Lieutenant errant = new Lieutenant("Knight Errant", "Charger 1", Skills.Charger1,
			"/lieutenants/sergeant.png");
	public static Lieutenant paladin = new Lieutenant("Paladin", "Charger 2", Skills.Charger2,
			"/lieutenants/sergeant.png");
	public static Lieutenant roland = new Lieutenant("Roland", "Charger 3", Skills.Charger3,
			"/lieutenants/sergeant.png");

	//Qoonfu
	public static Lieutenant monstrosity = new Lieutenant("Monstrosity", "Terrifying 1", Skills.Terrifying1,
			"/lieutenants/sergeant.png");
	public static Lieutenant abomination = new Lieutenant("Abomination", "Terrifying 2", Skills.Terrifying2,
			"/lieutenants/sergeant.png");
	public static Lieutenant hugo = new Lieutenant("Hugo", " Terrifying 3", Skills.Terrifying3,
			"/lieutenants/sergeant.png");

}
