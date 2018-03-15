package main.entity.captains;

import java.io.Serializable;

import javax.swing.ImageIcon;

import main.entity.skills.Skills;
import main.strings.CaptainBio;
import main.utility.ImageLoader;

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

	protected ImageLoader imageLoader = new ImageLoader();
	public ImageIcon icon;

	public Captain(String name, String gender, int attackBonus, int defenceBonus, int chargeBonus, int moraleBonus,
			int missileBonus, int speedBonus, int orders, int prestige, Skills skill1, Skills skill2, String bio) {

		this.attackBonus = attackBonus;
		this.defenceBonus = defenceBonus;
		this.chargeBonus = chargeBonus;
		this.moraleBonus = moraleBonus;
		this.missileBonus = missileBonus;
		this.speedBonus = speedBonus;

		this.name = name;
		this.gender = gender;

		this.orders = orders;
		this.prestige = prestige;

		this.skill1 = skill1;
		this.skill2 = skill2;

		this.bio = bio;

	}

	public static Captain boris = new Captain("Boris", "N.B.", 5, 2, 5, 2, 3, 3, 2, 24, Skills.Healer1, Skills.Deployer1,
			"just some text");
	public static Captain ole_racecar = new Captain("Ole Racecar", "female", 3, 2, 1, 5, 0, 0, 3, 40, Skills.Healer2,
			Skills.Deployer1, CaptainBio.ole_racecar);
	public static Captain nicole_schumi = new Captain("Nicole Schumi", "female", 6, 5, 6, 8, 0, 1, 3, 40,
			Skills.Deployer1, Skills.Healer1, "just some text");
	public static Captain mme_sauce = new Captain("Mme Sauce", "female", 3, 3, 2, -1, 0, 3, 2, 25, Skills.Deployer1,
			Skills.Healer1, "just some text");
	public static Captain maitre_oiseau = new Captain("Maitre Oiseau", "male", 2, 2, 0, 5, 4, 3, 2, 30, Skills.Deployer1,
			Skills.Healer1, "just some text");
	public static Captain galaxychaser = new Captain("Galaxychaser", "male", 3, 2, 1, 2, 3, 1, 1, 20, Skills.Deployer1,
			Skills.Healer1, "just some text");
	public static Captain hans_flogl = new Captain("Hans Flogl", "male", 2, 1, 1, 0, 1, 1, 2, 15, Skills.Deployer1,
			Skills.Healer1, "just some text");
	public static Captain anita_strum = new Captain("Anita Strum", "female", 2, 5, 1, 0, 5, 2, 2, 20, Skills.Deployer1,
			Skills.Healer1, "just some text");
	public static Captain claudia = new Captain("Claudia", "female", 0, 3, 1, 0, 5, 1, 3, 20, Skills.Deployer1,
			Skills.Healer1, "just some text");
	public static Captain professor = new Captain("Professor", "N.B.", 1, 2, 2, 3, 2, 3, 3, 30, Skills.Deployer1,
			Skills.Healer1, CaptainBio.PRS_Dreadnought);
}
