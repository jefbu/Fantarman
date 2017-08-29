package main.entity.regiments;

import main.battle.tactics.Condition;
import main.battle.tactics.Order;
import main.battle.tactics.Tactic;
import main.battle.tactics.Target;
import main.entity.captains.Captain;

public class Harvesters extends Regiment {
	
	public Harvesters(String name, Captain captain) {
		
		super();
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_STRONGEST, Order.CHARGE));
		
		this.name = name;
		this.value = 600;
		
		this.attack = 60 + captain.attackBonus;
		this.charge = 15 + captain.chargeBonus;
		this.defence = 65 + captain.defenceBonus;
		this.missile = 75 + captain.missileBonus;
		this.morale = 55 + captain.moraleBonus;
		this.speed = 6 + captain.speedBonus;
		this.speedVariation = 8;
		this.move = 6;
		this.run = 9;
		this.range = 12;
		this.life = 30;
		
		this.rows = 3;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/harvesters.png", width, height);
		
	}

}
