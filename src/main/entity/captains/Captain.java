package main.entity.captains;

import javax.swing.ImageIcon;

import main.entity.skills.Skills;
import main.utility.ImageLoader;

public class Captain {

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

	protected ImageLoader imageLoader = new ImageLoader();
	public ImageIcon icon;

	public Captain(String name, String gender, int attackBonus, int defenceBonus, int chargeBonus, int moraleBonus,
			int missileBonus, int speedBonus, int orders, int prestige, Skills skill1, Skills skill2) {

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

	}

	public static Captain boris = new Captain("Boris", "N.B.", 5, 2, 5, 2, 3, 3, 2, 24, Skills.Healer1,
			Skills.Deployer);

}
