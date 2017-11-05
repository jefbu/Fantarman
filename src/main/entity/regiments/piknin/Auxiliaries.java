package main.entity.regiments.piknin;

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

public class Auxiliaries extends Regiment {

	private static final long serialVersionUID = 1L;

	public Auxiliaries(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.race = Race.Piknin;
		this.lieutenantsSize = 1;
		this.captain = captain;
		this.type = RegimentType.LIGHT_INFANTRY;
		
		this.baseAttack = 40;
		this.baseCharge = 10;
		this.baseDefence = 45;
		this.baseMissile = 0;
		this.baseMorale = 45;
		this.baseSpeed = 12;
		this.baseSpeedVariation = 4;
		this.baseRange = 0;
		this.baseMove = 5;
		this.baseRun = 3;
		this.baseLife = 15;
		
		this.rows = 2;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/auxiliaries.png", width, height);
		
		weapons.add(Weapons.spears);
		weapons.add(Weapons.shields);
		
		armours.add(Armour.weatheredleather);
		armours.add(Armour.leather);
		armours.add(Armour.fullleather);
		
		this.weapon = Weapons.spears;
		this.armour = Armour.weatheredleather;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
