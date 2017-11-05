package main.entity.regiments.terribleTerquits;

import main.battle.tactics.Condition;
import main.battle.tactics.Order;
import main.battle.tactics.Tactic;
import main.battle.tactics.Target;
import main.entity.captains.Captain;
import main.entity.equipment.Armour;
import main.entity.equipment.Weapons;
import main.entity.races.Race;
import main.entity.regiments.Regiment;
import main.entity.regiments.RegimentType;

public class Arbalesters extends Regiment {

	private static final long serialVersionUID = 1L;

	public Arbalesters(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.race = Race.Terquit;
		this.lieutenantsSize = 2;
		this.captain = captain;
		this.type = RegimentType.COMBINED_ARMS;
		
		this.baseAttack = 50;
		this.baseCharge = 5;
		this.baseDefence = 60;
		this.baseMissile = 45;
		this.baseMorale = 80;
		this.baseSpeed = 12;
		this.baseSpeedVariation = 4;
		this.baseRange = 6;
		this.baseMove = 5;
		this.baseRun = 2;
		this.baseLife = 30;
		
		this.rows = 4;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/stout_of_heart.png", width, height);
		
		weapons.add(Weapons.pigeons);
		armours.add(Armour.weatheredleather);
		
		this.weapon = Weapons.pigeons;
		this.armour = Armour.weatheredleather;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
