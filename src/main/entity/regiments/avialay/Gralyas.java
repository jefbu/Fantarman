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

public class Gralyas extends Regiment {

	private static final long serialVersionUID = 1L;

	public Gralyas(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.race = Race.Avialay;
		this.lieutenantsSize = 0;
		this.captain = captain;
		this.type = RegimentType.FLYING;
		
		this.baseAttack = 45;
		this.baseCharge = 15;
		this.baseDefence = 45;
		this.baseMissile = 0;
		this.baseMorale = 65;
		this.baseSpeed = 18;
		this.baseSpeedVariation = 7;
		this.baseRange = 0;
		this.baseMove = 9;
		this.baseRun = 5;
		this.baseLife = 5;
		
		this.rows = 1;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/firemages.png", width, height);
		
		weapons.add(Weapons.talons);
		weapons.add(Weapons.sharpenedTalons);
		
		armours.add(Armour.feathered);
		
		this.weapon = Weapons.talons;
		this.armour = Armour.feathered;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
