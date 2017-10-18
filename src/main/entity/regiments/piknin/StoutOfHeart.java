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

public class StoutOfHeart extends Regiment {

	public StoutOfHeart(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.race = Race.Piknin;
		this.lieutenantsSize = 2;
		this.captain = captain;
		this.type = RegimentType.COMBINED_ARMS;
		
		this.baseAttack = 40;
		this.baseCharge = 10;
		this.baseDefence = 50;
		this.baseMissile = 40;
		this.baseMorale = 50;
		this.baseSpeed = 13;
		this.baseSpeedVariation = 4;
		this.baseRange = 8;
		this.baseMove = 5;
		this.baseRun = 3;
		this.baseLife = 20;
		
		this.rows = 2;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/stout_of_heart.png", width, height);
		
		weapons.add(Weapons.spears);
		weapons.add(Weapons.polearms);
		
		armours.add(Armour.quilt);
		armours.add(Armour.fullleather);
		armours.add(Armour.chainvest);
		
		this.weapon = Weapons.spears;
		this.armour = Armour.quilt;
		
		calculateTotalStats();
		calculateValue();
		
	}
	
}
