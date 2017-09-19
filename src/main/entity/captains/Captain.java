package main.entity.captains;

import javax.swing.ImageIcon;

import main.utility.ImageLoader;

public class Captain {

	public String name;

	public int attackBonus;
	public int defenceBonus;
	public int chargeBonus;
	public int moraleBonus;
	public int missileBonus;
	public int speedBonus;

	public int instructionSize;

	protected ImageLoader imageLoader = new ImageLoader();
	public ImageIcon icon;

	public Captain(String name, int attackBonus, int defenceBonus, int chargeBonus, int moraleBonus, int missileBonus,
			int speedBonus) {

		this.attackBonus = attackBonus;
		this.defenceBonus = defenceBonus;
		this.chargeBonus = chargeBonus;
		this.moraleBonus = moraleBonus;
		this.missileBonus = missileBonus;
		this.speedBonus = speedBonus;

		this.name = name;

	}
	
	public static Captain boris = new Captain("Boris", 3, 2, 5, 2, 6, 0);

}
