package main.entity.regiments.qoonfu;

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

public class CraneWing extends Regiment {

	private static final long serialVersionUID = 1L;

	public CraneWing(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.race = Race.Qoonfu;
		this.lieutenantsSize = 2;
		this.captain = captain;
		this.type = RegimentType.LIGHT_INFANTRY;
		
		this.baseAttack = 40;
		this.baseCharge = 10;
		this.baseDefence = 55;
		this.baseMissile = 0;
		this.baseMorale = 55;
		this.baseSpeed = 16;
		this.baseSpeedVariation = 5;
		this.baseRange = 0;
		this.baseMove = 6;
		this.baseRun = 4;
		this.baseLife = 15;
		
		this.rows = 3;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Qoonfu/crane_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Qoonfu/crane.png", width * 8, height * 8);

		
		weapons.add(Weapons.fists);
		
		armours.add(Armour.quilt);

		
		this.weapon = Weapons.fists;
		this.armour = Armour.quilt;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
