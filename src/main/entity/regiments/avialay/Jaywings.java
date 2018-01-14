package main.entity.regiments.avialay;

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

public class Jaywings extends Regiment {
	
	public Jaywings(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.race = Race.Avialay;
		this.lieutenantsSize = 1;
		this.captain = captain;
		this.type = RegimentType.FLYING;
		
		this.baseAttack = 40;
		this.baseCharge = 10;
		this.baseDefence = 40;
		this.baseMissile = 25;
		this.baseMorale = 50;
		this.baseSpeed = 17;
		this.baseSpeedVariation = 5;
		this.baseRange = 6;
		this.baseMove = 9;
		this.baseRun = 3;
		this.baseLife = 10;
		
		this.rows = 1;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/firemages.png", width, height);
		
		weapons.add(Weapons.talons);
		
		armours.add(Armour.feathered);
		armours.add(Armour.crested);
		
		this.weapon = Weapons.talons;
		this.armour = Armour.feathered;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
