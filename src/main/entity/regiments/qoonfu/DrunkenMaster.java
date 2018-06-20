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

public class DrunkenMaster extends Regiment {

	private static final long serialVersionUID = 1L;

	public DrunkenMaster(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Drunken Master";
		this.race = Race.Qoonfu;
		this.lieutenantsSize = 0;
		this.captain = captain;
		this.type = RegimentType.HERO;
		
		this.baseAttack = 40;
		this.baseCharge = 20;
		this.baseDefence = 80;
		this.baseMissile = 0;
		this.baseMorale = 80;
		this.baseSpeed = 16;
		this.baseSpeedVariation = 5;
		this.baseRange = 0;
		this.baseMove = 6;
		this.baseRun = 5;
		this.baseLife = 5;
		
		this.rows = 2;
		this.columns = 2;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Qoonfu/drunk_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Qoonfu/drunk.png", width * 8, height * 8);
		
		weapons.add(Weapons.fists);
		weapons.add(Weapons.bamboo);
		weapons.add(Weapons.dao);
		weapons.add(Weapons.chain);
		
		armours.add(Armour.quilt);

		
		this.weapon = Weapons.fists;
		this.armour = Armour.quilt;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
