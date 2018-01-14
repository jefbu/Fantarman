package main.entity.regiments.sacredCrux;

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

public class RedemptionSpirit extends Regiment {

	private static final long serialVersionUID = 1L;

	public RedemptionSpirit(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_STRONGEST, Order.FIRE));
		}
		
		this.name = name;
		this.race = Race.Feods;
		this.lieutenantsSize = 2;
		this.captain = captain;
		this.type = RegimentType.ARCHERS;
				
		this.baseAttack = 35;
		this.baseCharge = 5;
		this.baseDefence = 45;
		this.baseMissile = 40;
		this.baseMorale = 50;
		this.baseSpeed = 15;
		this.baseSpeedVariation = 4;
		this.baseRange = 9;
		this.baseMove = 5;
		this.baseRun = 4;
		this.baseLife = 25;
		
		this.rows = 2;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/dovemasters.png", width, height);
		
		weapons.add(Weapons.bows);
		weapons.add(Weapons.longbows);
		weapons.add(Weapons.recurve);
		
		armours.add(Armour.quilt);
		armours.add(Armour.halfLeather);
		
		this.weapon = Weapons.bows;
		this.armour = Armour.halfLeather;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
