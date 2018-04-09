package main.entity.regiments.feods;

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

public class Praetoriae extends Regiment {

	private static final long serialVersionUID = 1L;

	public Praetoriae(String name, Captain captain, Lieutenant lt1, Lieutenant lt2, Lieutenant lt3) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_STRONGEST, Order.FIRE));
		}
		
		this.name = name;
		this.regiment = "Praetoriae";
		this.race = Race.Feods;
		this.lieutenantsSize = 3;
		this.captain = captain;
		this.type = RegimentType.HEAVY_CAVALRY;
		
		lieutenants.add(lt1);
		lieutenants.add(lt2);
		lieutenants.add(lt3);
				
		this.baseAttack = 45;
		this.baseCharge = 25;
		this.baseDefence = 55;
		this.baseMissile = 0;
		this.baseMorale = 55;
		this.baseSpeed = 14;
		this.baseSpeedVariation = 4;
		this.baseRange = 0;
		this.baseMove = 6;
		this.baseRun = 5;
		this.baseLife = 15;
		
		this.rows = 4;
		this.columns = 2;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/feods/shield_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/feods/shield.png", width * 8, height * 8);
		
		weapons.add(Weapons.swords);
		
		armours.add(Armour.halfPlate);
		armours.add(Armour.plate);
		
		this.weapon = Weapons.swords;
		this.armour = Armour.halfPlate;
		
		calculateTotalStats();
		calculateValue();
	}

}
