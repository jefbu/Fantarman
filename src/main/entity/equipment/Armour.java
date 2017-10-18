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
	
	public static Armour shell = new Armour("Hard Shell", 0, 0, 0, 0, 0, 0);
	public static Armour metalshell = new Armour("Reinforced", 0, 1, 5, 0, 75, 15);
	
	public static Armour weatheredleather = new Armour("Weathered", 0, 0, 0, 0, 0, 0);
	public static Armour fullleather = new Armour("Full Leather", 0, 0, 8, 0, 125, 40);
	
	public static Armour woven = new Armour("Woven Basket", 0, 0, 0, 0, 0, 0);
	public static Armour mythrilenvelope = new Armour("Mithril Envelope", 1, 0, 20, 0, 150, 20);
	
	public static Armour chainvest = new Armour("Chain Vest", 0, 0, 10, 0, 125, 50);
	
}
