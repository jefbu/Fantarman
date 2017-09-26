package main.entity.equipment;

public class Weapons {
	
	String name;

	int spdPenalty;
	int attackBonus;
	int chargeBonus;
	int defenceBonus;
	int rangeBonus;
	int missileBonus;

	int equipCost;
	int upkeep;

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
	public static Weapons thoroughbredPigeons = new Weapons("Thoroughbred Pigeons", 0, 0, 0, 0, 1, 0, 120, 25);
	
	
	
	
	

}
