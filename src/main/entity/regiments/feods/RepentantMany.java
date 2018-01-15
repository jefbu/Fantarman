package main.entity.regiments.feods;

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

public class RepentantMany extends Regiment {
	
	private static final long serialVersionUID = 1L;

	public RepentantMany(String name, Captain captain) {
				
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_STRONGEST, Order.FIRE));
		}
		
		this.name = name;
		this.race = Race.Feods;
		this.lieutenantsSize = 2;
		this.captain = captain;
		this.type = RegimentType.LIGHT_INFANTRY;
				
		this.baseAttack = 40;
		this.baseCharge = 10;
		this.baseDefence = 40;
		this.baseMissile = 0;
		this.baseMorale = 40;
		this.baseSpeed = 14;
		this.baseSpeedVariation = 4;
		this.baseRange = 0;
		this.baseMove = 6;
		this.baseRun = 3;
		this.baseLife = 30;
		
		this.rows = 3;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/dovemasters.png", width, height);
		
		weapons.add(Weapons.spears);
		weapons.add(Weapons.slingshots);
		
		armours.add(Armour.quilt);
		armours.add(Armour.halfLeather);
		
		this.weapon = Weapons.spears;
		this.armour = Armour.halfLeather;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
