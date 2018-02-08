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

public class ShiningFaithful extends Regiment {
	
	private static final long serialVersionUID = 1L;
	
	public ShiningFaithful(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_STRONGEST, Order.FIRE));
		}
		
		this.name = name;
		this.race = Race.Feods;
		this.lieutenantsSize = 3;
		this.captain = captain;
		this.type = RegimentType.HEAVY_INFANTRY;
				
		this.baseAttack = 55;
		this.baseCharge = 20;
		this.baseDefence = 60;
		this.baseMissile = 0;
		this.baseMorale = 70;
		this.baseSpeed = 14;
		this.baseSpeedVariation = 4;
		this.baseRange = 0;
		this.baseMove = 5;
		this.baseRun = 3;
		this.baseLife = 30;
		
		this.rows = 4;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/feods/faithful_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/feods/faithful.png", width * 8, height * 8);
		
		weapons.add(Weapons.swords);
		weapons.add(Weapons.halberds);
		
		armours.add(Armour.halfPlate);
		armours.add(Armour.plate);
		
		this.weapon = Weapons.swords;
		this.armour = Armour.halfPlate;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
