package main.entity.regiments.avialay;

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

public class Corpus extends Regiment {

	private static final long serialVersionUID = 1L;

	public Corpus(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.race = Race.Avialay;
		this.lieutenantsSize = 1;
		this.captain = captain;
		this.type = RegimentType.HEAVY_INFANTRY;
		
		this.baseAttack = 55;
		this.baseCharge = 25;
		this.baseDefence = 50;
		this.baseMissile = 0;
		this.baseMorale = 60;
		this.baseSpeed = 14;
		this.baseSpeedVariation = 5;
		this.baseRange = 0;
		this.baseMove = 6;
		this.baseRun = 4;
		this.baseLife = 20;
		
		this.rows = 2;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Avialay/corvus.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Avialay/corvus.png", width * 8, height * 8);
		
		weapons.add(Weapons.talons);
		weapons.add(Weapons.sharpenedTalons);
		
		armours.add(Armour.feathered);
		armours.add(Armour.crested);
		
		this.weapon = Weapons.talons;
		this.armour = Armour.feathered;
		
		calculateTotalStats();
		calculateValue();
		
	}
		

}
