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

public class Magpies extends Regiment {

	private static final long serialVersionUID = 1L;

	public Magpies(String name, Captain captain, Lieutenant lt1) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Magpies";
		this.race = Race.Avialay;
		this.lieutenantsSize = 1;
		this.captain = captain;
		lieutenants.add(lt1);
		this.type = RegimentType.COMBINED_ARMS;
		
		this.baseAttack = 35;
		this.baseCharge = 10;
		this.baseDefence = 45;
		this.baseMissile = 40;
		this.baseMorale = 55;
		this.baseSpeed = 16;
		this.baseSpeedVariation = 5;
		this.baseRange = 12;
		this.baseMove = 6;
		this.baseRun = 6;
		this.baseLife = 10;
		
		this.rows = 2;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Avialay/magpie_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Avialay/magpie.png", width * 8, height * 8);
		
		weapons.add(Weapons.talons);
		weapons.add(Weapons.sharpenedTalons);
		
		armours.add(Armour.feathered);
		
		this.weapon = Weapons.talons;
		this.armour = Armour.feathered;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
