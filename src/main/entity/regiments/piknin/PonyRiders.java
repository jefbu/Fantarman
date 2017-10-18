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

public class PonyRiders extends Regiment {
	
	public PonyRiders(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.race = Race.Piknin;
		this.lieutenantsSize = 1;
		this.captain = captain;
		this.type = RegimentType.LIGHT_CAVALRY;
		
		this.baseAttack = 40;
		this.baseCharge = 15;
		this.baseDefence = 40;
		this.baseMissile = 0;
		this.baseMorale = 45;
		this.baseSpeed = 13;
		this.baseSpeedVariation = 4;
		this.baseRange = 0;
		this.baseMove = 6;
		this.baseRun = 6;
		this.baseLife = 10;
		
		this.rows = 1;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/pony_riders.png", width, height);
		
		weapons.add(Weapons.spears);
		weapons.add(Weapons.slingshots);
		weapons.add(Weapons.shields);
		
		armours.add(Armour.quilt);
		armours.add(Armour.halfLeather);
		armours.add(Armour.leather);
		
		this.weapon = Weapons.spears;
		this.armour = Armour.quilt;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
