package main.entity.equipment;

import java.io.Serializable;

public class Weapons implements Serializable {

	private static final long serialVersionUID = 1L;

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
	
	public static Weapons pigeons = new Weapons("Squab Pigeons", 0, 0, 0, 0, 0, 0, 0, 0);
	public static Weapons elitePigeons = new Weapons("Elite Pigeons", 0, 0, 0, 0, 0, 5, 100, 20);
	public static Weapons thoroughbredPigeons = new Weapons("Thoroughbred", 0, 0, 0, 0, 1, 0, 120, 25);
	public static Weapons turtledoves = new Weapons("Turtle Doves", 0, 0, 0, 0, 2, -10, 125, 25);
	
	public static Weapons claws = new Weapons("Claws", 0, 0, 0, 0, 0, 0, 0, 0);
	public static Weapons spikes = new Weapons("Extra Spikes", 0, 0, 10, 0, 0, 0, 75, 10);
	public static Weapons razorclaws = new Weapons("Sharpened Claws", 0, 5, 0, 0, 0, 0, 100, 20);
	
	public static Weapons sickles = new Weapons("Sickles", 0, 0, 0, 0, 0, 0, 0, 0);
	public static Weapons scythes = new Weapons("Scythes", 0, 5, 0, 5, 0, 0, 50, 20);
	public static Weapons flails = new Weapons("Flails", 0, 5, 5, 0, 0, 0, 50, 15);
	
	public static Weapons wands = new Weapons("Magic Wands", 0, 0, 0, 0, 0, 0, 0, 0);
	public static Weapons staves = new Weapons("Oaken Staves", 0, 5, 0, 5, 0, 0, 75, 15);
	public static Weapons sceptres = new Weapons("Royal Sceptres", 0, 0, 0, 0, 0, 5, 75, 25);
	public static Weapons crosiers = new Weapons("Crosiers", 0, 0, 0, 0, -1, 10, 100, 30);
	
	public static Weapons spears = new Weapons("Spears", 0, 0, 0, 0, 0, 0, 0, 0);
	public static Weapons slingshots = new Weapons("Slingshots", 0, 0, 0, 0, 5, 30, 100, 15);
	public static Weapons shields = new Weapons("Shields", 0, 0, 0, 10, 0, 0, 75, 20);
	
	public static Weapons bombs = new Weapons("Bombs", 0, 0, 0, 0, 0, 0, 0, 0);
	public static Weapons skunkbombs = new Weapons("Skunk Bombs", 0, 0, 0, 0, 0, 5, 50, 25);
	
	public static Weapons polearms = new Weapons("Polearms", 0, 5, 5, 5, 0, 0, 125, 25);
	
	public static Weapons fists = new Weapons("Fists", 0, 0, 0, 0, 0, 0, 0, 0);
	
	public static Weapons kukris = new Weapons("Kukris", 0, 10, 0, 0, 0, 0, 50, 25);
	
	public static Weapons slings = new Weapons("Slings", 0, 0, 0, 0, 0, 0, 0, 0);
	public static Weapons kestros = new Weapons("Kestros", 0, 0, 0, 0, 1, 0, 100, 25);
	
	public static Weapons glaives = new Weapons("Glaives", 0, 0, 0, 0, 0, 0, 0, 0);
	
	public static Weapons talons = new Weapons("Talons", 0, 0, 0, 0, 0, 0, 0, 0);
	public static Weapons sharpenedTalons = new Weapons("Sharpened", 0, 5, 0, 0, 0, 0, 50, 15);
	
	public static Weapons bows = new Weapons("Bows", 0, 0, 0, 0, 0, 0, 0, 0);
	public static Weapons longbows = new Weapons("Longbows", 1, 0, 0, 0, 1, 5, 100, 30);
	public static Weapons recurve = new Weapons("Recurve Bows", 0, 0, 0, 0, 0, 5, 75, 35);
	
	public static Weapons lances = new Weapons("Lances", 0, 0, 0, 0, 0, 0, 0, 0);
	
	public static Weapons swords = new Weapons("Swords", 0, 0, 0, 0, 0, 0, 0, 0);
	public static Weapons halberds = new Weapons("Halberds", 0, 0, 0, -5, 5, 0, 50, 20);
	
	public static Weapons twohanders = new Weapons("Two Handed", 0, 5, -10, 0, 0, 0, 50, 30);
	
	public static Weapons hairpins = new Weapons("Hairpins", 0, 0, 0, 0, 0, 0, 0, 0);
	public static Weapons tiffanys = new Weapons("Tiffanys", 0, 0, 0, 0, 0, 5, 150, 10);
	
	public static Weapons bamboo = new Weapons("Bamboo", 0, 2, 2, 2, 0, 0, 50, 25);
	public static Weapons dao = new Weapons("Dao Sword", 0, 5, 0, 0, 0, 0, 50, 30);
	public static Weapons chain = new Weapons("Chain Whip", 0, 0, 0, 0, 3, 40, 75, 25);
	
	
	
	
	
	
	

}
