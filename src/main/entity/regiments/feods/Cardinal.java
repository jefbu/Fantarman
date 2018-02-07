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

public class Cardinal extends Regiment {

	private static final long serialVersionUID = 1L;

	public Cardinal(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_STRONGEST, Order.FIRE));
		}
		
		this.name = name;
		this.race = Race.Feods;
		this.lieutenantsSize = 0;
		this.captain = captain;
		this.type = RegimentType.MONSTER;
				
		this.baseAttack = 40;
		this.baseCharge = 5;
		this.baseDefence = 50;
		this.baseMissile = 25;
		this.baseMorale = 65;
		this.baseSpeed = 14;
		this.baseSpeedVariation = 4;
		this.baseRange = 12;
		this.baseMove = 6;
		this.baseRun = 3;
		this.baseLife = 5;
		
		this.rows = 2;
		this.columns = 2;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/feods/cardinal.png", width, height);
		
		weapons.add(Weapons.wands);
		weapons.add(Weapons.staves);
		weapons.add(Weapons.sceptres);
		weapons.add(Weapons.crosiers);
		
		armours.add(Armour.robes);
		armours.add(Armour.vestments);
		
		this.weapon = Weapons.wands;
		this.armour = Armour.robes;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
