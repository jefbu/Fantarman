package main.entity.regiments.wanmen;

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

public class Stiltleg extends Regiment {

	private static final long serialVersionUID = 1L;

	public Stiltleg (String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.race = Race.Wanmen;
		this.lieutenantsSize = 3;
		this.captain = captain;
		this.type = RegimentType.LIGHT_INFANTRY;
		
		this.baseAttack = 45;
		this.baseCharge = 10;
		this.baseDefence = 40;
		this.baseMissile = 0;
		this.baseMorale = 45;
		this.baseSpeed = 18;
		this.baseSpeedVariation = 6;
		this.baseRange = 0;
		this.baseMove = 6;
		this.baseRun = 5;
		this.baseLife = 20;
		
		this.rows = 2;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/wanmen/stiltleg.png", width, height);
		
		weapons.add(Weapons.sickles);
		weapons.add(Weapons.scythes);
		weapons.add(Weapons.kukris);
		
		armours.add(Armour.chitin);

		this.weapon = Weapons.sickles;
		this.armour = Armour.chitin;
		
		calculateTotalStats();
		calculateValue();
		
	}
	
 
}
