package main.entity.regiments.avialay;

import main.battle.tactics.Condition;
import main.battle.tactics.Order;
import main.battle.tactics.Tactic;
import main.battle.tactics.Target;
import main.entity.captains.Captain;
import main.entity.equipment.Armour;
import main.entity.equipment.Weapons;
import main.entity.lieutenants.Lieutenant;
import main.entity.races.Race;
import main.entity.regiments.Regiment;
import main.entity.regiments.RegimentType;

public class Jaywings extends Regiment {

	private static final long serialVersionUID = 1L;

	public Jaywings(String name, Captain captain, Lieutenant lt1) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Jaywings";
		this.race = Race.Avialay;
		this.lieutenantsSize = 1;
		this.captain = captain;
		lieutenants.add(lt1);
		this.type = RegimentType.FLYING;
		
		this.baseAttack = 35;
		this.baseCharge = 20;
		this.baseDefence = 55;
		this.baseMissile = 40;
		this.baseMorale = 50;
		this.baseSpeed = 17;
		this.baseSpeedVariation = 5;
		this.baseRange = 10;
		this.baseMove = 9;
		this.baseRun = 3;
		this.baseLife = 10;
		
		this.rows = 1;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Avialay/jaywing_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Avialay/jaywing.png", width * 8, height * 8);
		
		weapons.add(Weapons.talons);
		
		armours.add(Armour.feathered);
		armours.add(Armour.crested);
		
		this.weapon = Weapons.talons;
		this.armour = Armour.feathered;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
