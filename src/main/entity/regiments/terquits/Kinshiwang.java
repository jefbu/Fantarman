package main.entity.regiments.terquits;

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

public class Kinshiwang extends Regiment {

	private static final long serialVersionUID = 1L;
	
	public Kinshiwang(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.race = Race.Terquit;
		this.lieutenantsSize = 2;
		this.captain = captain;
		this.type = RegimentType.HEAVY_INFANTRY;
		
		this.baseAttack = 55;
		this.baseCharge = 10;
		this.baseDefence = 65;
		this.baseMissile = 0;
		this.baseMorale = 80;
		this.baseSpeed = 11;
		this.baseSpeedVariation = 3;
		this.baseRange = 0;
		this.baseMove = 5;
		this.baseRun = 1;
		this.baseLife = 30;
		
		this.rows = 3;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Terquit/kinshiwang_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Terquit/kinshiwang.png", width * 8, height * 8);
		
		weapons.add(Weapons.fists);
		armours.add(Armour.clay);
		
		this.weapon = Weapons.fists;
		this.armour = Armour.clay;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
