package main.entity.regiments;

import main.entity.captains.Captain;
import main.entity.tactics.Tactic;

public class DoveMasters extends Regiment {
		
	public DoveMasters(String name, Captain captain) {
		
		super();
		instructions.add(Tactic.defaultTactic);
		
		this.name = name;
		this.value = 1000;
				
		this.attack = 90 + captain.attackBonus;
		this.charge = 10 + captain.chargeBonus;
		this.defence = 30 + captain.defenceBonus;
		this.missile = 50 + captain.missileBonus;
		this.morale = 40 + captain.moraleBonus;
		this.speed = 5 + captain.speedBonus;
		this.speedVariation = 10;
		this.range = 16;
		this.move = 4;
		this.run = 2;
		this.run = 6;
		this.life = 25;
		
		this.rows = 1;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/dovemasters.png", width, height);
		
	}

}
