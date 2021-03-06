package main.entity.regiments.terquits;

import main.battle.tactics.Condition;
import main.battle.tactics.Order;
import main.battle.tactics.Tactic;
import main.battle.tactics.Target;
import main.entity.captains.Captain;
import main.entity.equipment.Armour;
import main.entity.equipment.Weapons;
import main.entity.lieutenants.Lieutenant;
import main.entity.races.Race;
import main.entity.regiments.Regiment;
import main.entity.regiments.RegimentType;

public class PebbleHurlers extends Regiment {

	private static final long serialVersionUID = 1L;

	public PebbleHurlers(String name, Captain captain, Lieutenant lt1) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Pebble Hurlers";
		this.race = Race.Terquit;
		this.lieutenantsSize = 1;
		this.captain = captain;
		lieutenants.add(lt1);
		this.type = RegimentType.ARCHERS;
		
		this.baseAttack = 30;
		this.baseCharge = 5;
		this.baseDefence = 45;
		this.baseMissile = 30;
		this.baseMorale = 75;
		this.baseSpeed = 12;
		this.baseSpeedVariation = 4;
		this.baseRange = 13;
		this.baseMove = 5;
		this.baseRun = 2;
		this.baseLife = 15;
		
		this.rows = 2;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Terquit/pebblehurlers_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Terquit/pebblehurlers.png", width * 8, height * 8);
		
		weapons.add(Weapons.fists);
		armours.add(Armour.clay);
		
		this.weapon = Weapons.fists;
		this.armour = Armour.clay;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
