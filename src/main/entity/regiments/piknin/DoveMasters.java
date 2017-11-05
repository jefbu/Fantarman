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

public class DoveMasters extends Regiment {

	private static final long serialVersionUID = 1L;

	public DoveMasters(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_STRONGEST, Order.FIRE));
		}
		
		this.name = name;
		this.race = Race.Piknin;
		this.lieutenantsSize = 1;
		this.captain = captain;
		this.type = RegimentType.ARCHERS;
				
		this.baseAttack = 35;
		this.baseCharge = 5;
		this.baseDefence = 40;
		this.baseMissile = 45;
		this.baseMorale = 40;
		this.baseSpeed = 13;
		this.baseSpeedVariation = 4;
		this.baseRange = 8;
		this.baseMove = 5;
		this.baseRun = 3;
		this.baseLife = 10;
		
		this.rows = 1;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/dovemasters.png", width, height);
		
		weapons.add(Weapons.pigeons);
		weapons.add(Weapons.elitePigeons);
		weapons.add(Weapons.thoroughbredPigeons);
		weapons.add(Weapons.turtledoves);
		
		armours.add(Armour.quilt);
		armours.add(Armour.halfLeather);
		armours.add(Armour.leather);
		
		this.weapon = Weapons.pigeons;
		this.armour = Armour.quilt;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
