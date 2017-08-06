package main.entity.regiments;

import main.entity.captains.Captain;

public class FireMages extends Regiment {
	
	public FireMages(String name, Captain captain) {
		
		super();
		
		this.name = name;
		
		this.attack = 40 + captain.attackBonus;
		this.charge = 15 + captain.chargeBonus;
		this.defence = 45 + captain.defenceBonus;
		this.missile = 75 + captain.missileBonus;
		this.morale = 55 + captain.moraleBonus;
		this.speed = 5 + captain.speedBonus;
		this.speedVariation = 8;
		this.move = 4;
		this.range = 12;
		this.run = 6;
		
		this.rows = 2;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/firemages.png", width, height);
		
	}
	

}
