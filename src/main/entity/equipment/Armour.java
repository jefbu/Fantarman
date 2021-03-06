package main.entity.equipment;

import java.io.Serializable;

public class Armour implements Serializable {

	private static final long serialVersionUID = 1L;

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
	
	public static Armour clay = new Armour("Clay", 0, 0, 0, 0, 0, 0);
	public static Armour porcelain = new Armour("Porcelain", 0, 0, 0, 3, 50, 25);
	
	public static Armour chitin = new Armour("Chitin", 0, 0, 0, 0, 0, 0);
	public static Armour moult = new Armour("Moult", 0, 1, 5, 0, 50, 15);
	
	public static Armour feathered = new Armour("Feathered", 0, 0, 0, 0, 0, 0);
	public static Armour crested = new Armour("Crested", 0, 0, 2, 5, 100, 40);
	
	public static Armour robes = new Armour("Robes", 0, 0, 0, 0, 0, 0);
	public static Armour vestments = new Armour("Vestments", 0, 0, 0, 5, 50, 20);
	
	public static Armour halfPlate = new Armour("Half Plate", 0, 0, 0, 0, 0, 0);
	public static Armour plate = new Armour("Plate", 1, 1, 10, 5, 75, 50);
	public static Armour chainMail = new Armour("Chain Mail", 0, 0, 0, 0, 50, -5);
	
	
}
