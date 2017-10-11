package main.entity.regiments;

import main.battle.tactics.Condition;
import main.battle.tactics.Order;
import main.battle.tactics.Tactic;
import main.battle.tactics.Target;
import main.entity.captains.Captain;

public class FireMages extends Regiment {
	
	public FireMages(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.value = 600;
		this.upkeep = value / 10;
		this.lieutenantsSize = 1;
		this.captain = captain;
		this.type = RegimentType.ARCHERS;
		
		this.attack = 45 + captain.attackBonus;
		this.charge = 15 + captain.chargeBonus;
		this.defence = 40 + captain.defenceBonus;
		this.missile = 55 + captain.missileBonus;
		this.morale = 55 + captain.moraleBonus;
		this.speed = 5 + captain.speedBonus;
		this.speedVariation = 8;
		this.move = 7;
		this.run = 9;
		this.range = 12;
		this.life = 20;
		
		this.rows = 2;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/firemages.png", width, height);
		
	}
	

}
