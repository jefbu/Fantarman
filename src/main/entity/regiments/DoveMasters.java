package main.entity.regiments;

import main.entity.captains.Captain;

public class DoveMasters extends Regiment {
		
	public DoveMasters(String name, Captain captain) {
		
		super();
		
		this.name = name;
				
		this.attack = 30 + captain.attackBonus;
		this.charge = 10 + captain.chargeBonus;
		this.defence = 30 + captain.defenceBonus;
		this.missile = 50 + captain.missileBonus;
		this.morale = 40 + captain.moraleBonus;
		this.speed = 5 + captain.speedBonus;
		this.speedVariation = 10;
		this.range = 16;
		this.move = 4;
		this.run = 6;
		
		this.rows = 1;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/dovemasters.png", width, height);
		
	}

}
