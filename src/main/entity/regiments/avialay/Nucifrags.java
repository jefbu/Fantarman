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

public class Nucifrags extends Regiment {

	private static final long serialVersionUID = 1L;

	public Nucifrags(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Nucifrags";
		this.race = Race.Avialay;
		this.lieutenantsSize = 0;
		this.captain = captain;
		this.type = RegimentType.ARCHERS;
		
		this.baseAttack = 30;
		this.baseCharge = 5;
		this.baseDefence = 40;
		this.baseMissile = 50;
		this.baseMorale = 50;
		this.baseSpeed = 16;
		this.baseSpeedVariation = 4;
		this.baseRange = 12;
		this.baseMove = 6;
		this.baseRun = 5;
		this.baseLife = 10;
		
		this.rows = 1;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Avialay/nucifrag_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Avialay/nucifrag.png", width * 8, height * 8);
		
		weapons.add(Weapons.talons);
		
		armours.add(Armour.feathered);
		
		this.weapon = Weapons.talons;
		this.armour = Armour.feathered;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
