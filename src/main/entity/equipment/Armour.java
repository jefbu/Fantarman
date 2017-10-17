package main.entity.equipment;

public class Armour {

	public String name;

	public int movPenalty;
	public int spdPenalty;
	public int defenceBonus;
	public int moraleBonus;

	public int equipCost;
	public int upkeep;

	public Armour(String name, int movPenalty, int spdPenalty, int defenceBonus, int moraleBonus,
			int equipCost, int upkeep) {

		this.name = name;
		this.movPenalty = movPenalty;
		this.spdPenalty = spdPenalty;
		this.defenceBonus = defenceBonus;
		this.moraleBonus = moraleBonus;
		this.equipCost = equipCost;
		this.upkeep = upkeep;

	}
	
	public static Armour quilt = new Armour("Quilt Tunic", 0, 0, 0, 0, 0, 0);
	public static Armour halfLeather = new Armour("Half-Leather", 0, 0, 3, 0, 100, 20);
	public static Armour leather = new Armour("Leather", 0, 0, 5, 0, 120, 25);
	
}
