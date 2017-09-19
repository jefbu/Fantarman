package main.entity.regiments;

import main.battle.tactics.Condition;
import main.battle.tactics.Order;
import main.battle.tactics.Tactic;
import main.battle.tactics.Target;
import main.entity.captains.Captain;

public class DoveMasters extends Regiment {
		
	public DoveMasters(String name, Captain captain) {
		
		super();
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_STRONGEST, Order.FIRE));
		
		this.name = name;
		this.value = 1000;
		this.captain = captain;
				
		this.attack = 40 + captain.attackBonus;
		this.charge = 10 + captain.chargeBonus;
		this.defence = 35 + captain.defenceBonus;
		this.missile = 50 + captain.missileBonus;
		this.morale = 40 + captain.moraleBonus;
		this.speed = 5 + captain.speedBonus;
		this.speedVariation = 10;
		this.range = 16;
		this.move = 4;
		this.run = 2;
		this.life = 15;
		
		this.rows = 1;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/dovemasters.png", width, height);
		
	}

}
