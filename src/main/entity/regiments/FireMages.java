package main.entity.regiments;

import main.entity.captains.Captain;
import main.entity.tactics.Condition;
import main.entity.tactics.Order;
import main.entity.tactics.Tactic;
import main.entity.tactics.Target;

public class FireMages extends Regiment {
	
	public FireMages(String name, Captain captain) {
		
		super();
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_NEAREST, Order.CHARGE));
		
		this.name = name;
		this.value = 600;
		
		this.attack = 40 + captain.attackBonus;
		this.charge = 15 + captain.chargeBonus;
		this.defence = 25 + captain.defenceBonus;
		this.missile = 75 + captain.missileBonus;
		this.morale = 55 + captain.moraleBonus;
		this.speed = 5 + captain.speedBonus;
		this.speedVariation = 8;
		this.move = 4;
		this.run = 2;
		this.range = 12;
		this.life = 25;
		
		this.rows = 2;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/firemages.png", width, height);
		
	}
	

}
