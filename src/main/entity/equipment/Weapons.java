package main.entity.equipment;

public class Weapons {
	
	public String name;

	public int spdPenalty;
	public int attackBonus;
	public int chargeBonus;
	public int defenceBonus;
	public int rangeBonus;
	public int missileBonus;

	public int equipCost;
	public int upkeep;

	public Weapons(String name, int spdPenalty, int attackBonus, int chargeBonus, int defenceBonus, int rangeBonus, int missileBonus,
			int equipCost, int upkeep) {

		this.name = name;
		this.spdPenalty = spdPenalty;
		this.attackBonus = attackBonus;
		this.chargeBonus = chargeBonus;
		this.defenceBonus = defenceBonus;
		this.rangeBonus = rangeBonus;
		this.missileBonus = missileBonus;
		this.equipCost = equipCost;
		this.upkeep = upkeep;

	}
	
	public static Weapons elitePigeons = new Weapons("Elite Pigeons", 0, 0, 0, 0, 0, 5, 100, 20);
	public static Weapons thoroughbredPigeons = new Weapons("Thoroughbred", 0, 0, 0, 0, 1, 0, 120, 25);
	public static Weapons turtledoves = new Weapons("Turtle Doves", 0, 0, 0, 0, 2, -10, 125, 25);
	
	
	
	
	

}
